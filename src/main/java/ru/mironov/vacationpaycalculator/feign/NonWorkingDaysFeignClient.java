package ru.mironov.vacationpaycalculator.feign;

import java.time.LocalDate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nonWorkingDaysFeignClient", url = "https://isdayoff.ru")
public interface NonWorkingDaysFeignClient {

    @GetMapping("/{date}")
    String checkDay(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable LocalDate date);
}
