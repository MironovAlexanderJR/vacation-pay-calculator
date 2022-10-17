package ru.mironov.vacationpaycalculator.model;

import java.time.LocalDate;
import javax.validation.constraints.DecimalMin;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VacationDto {

    LocalDate startVacationDate;
    LocalDate endVacationDate;
    @DecimalMin(value = "1.0")
    double avgSalary;
    Integer vacationDays;

}
