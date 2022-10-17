package ru.mironov.vacationpaycalculator.service.impl;

import java.util.Objects;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mironov.vacationpaycalculator.feign.NonWorkingDaysFeignClient;
import ru.mironov.vacationpaycalculator.model.VacationDto;
import ru.mironov.vacationpaycalculator.service.VacationPayCalculatorService;

@Service
@RequiredArgsConstructor
public class VacationPayCalculatorServiceImpl implements VacationPayCalculatorService {

    private final double AVERAGE_DAYS_PER_MONTH = 29.3;
    private final NonWorkingDaysFeignClient nonWorkingDaysFeignClient;


    @Override
    public String calculateVacationPayWithNumberOfDays(VacationDto vacationDto) {
        return String.format(
                "%.2f", vacationDto.getAvgSalary() / 12 / AVERAGE_DAYS_PER_MONTH * vacationDto.getVacationDays());
    }

    @Override
    public String calculateVacationPayWithDateOfStartAndEndOfVacation(VacationDto vacationDto) {
        long daysCounter =
                Stream.iterate(vacationDto.getStartVacationDate(), date -> date.plusDays(1))
                        .limit(vacationDto.getEndVacationDate().getDayOfMonth() - vacationDto.getStartVacationDate().getDayOfMonth())
                        .filter(date -> Objects.equals(nonWorkingDaysFeignClient.checkDay(date), "0"))
                        .count();

        return String.format("%.2f", vacationDto.getAvgSalary() / 12 / AVERAGE_DAYS_PER_MONTH * daysCounter);
    }
}
