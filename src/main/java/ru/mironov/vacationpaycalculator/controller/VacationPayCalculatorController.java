package ru.mironov.vacationpaycalculator.controller;

import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.mironov.vacationpaycalculator.model.VacationDto;
import ru.mironov.vacationpaycalculator.service.VacationPayCalculatorService;

@RestController
@RequiredArgsConstructor
public class VacationPayCalculatorController {

    private final VacationPayCalculatorService vacationPayCalculatorService;

    @GetMapping("/calculate")
    public String calculateVacationPay(@Valid @RequestBody VacationDto vacationDto) {
        if (vacationDto.getVacationDays() != null) {
            return vacationPayCalculatorService.calculateVacationPayWithNumberOfDays(vacationDto);
        } else if (vacationDto.getStartVacationDate() != null && vacationDto.getEndVacationDate() != null) {
            return vacationPayCalculatorService.calculateVacationPayWithDateOfStartAndEndOfVacation(vacationDto);
        } else {
            return "Введите корректные данные";
        }
    }
}
