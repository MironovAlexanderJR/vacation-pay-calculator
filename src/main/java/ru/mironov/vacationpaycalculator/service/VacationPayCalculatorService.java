package ru.mironov.vacationpaycalculator.service;

import java.math.BigDecimal;
import ru.mironov.vacationpaycalculator.model.VacationDto;

public interface VacationPayCalculatorService {

    String calculateVacationPayWithNumberOfDays(VacationDto vacationDto);

    String calculateVacationPayWithDateOfStartAndEndOfVacation(VacationDto vacationDto);

}
