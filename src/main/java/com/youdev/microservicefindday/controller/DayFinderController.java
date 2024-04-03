package com.youdev.microservicefindday.controller;



import com.youdev.microservicefindday.entities.DayOfWeekResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

@RestController
public class DayFinderController {

    @GetMapping("/services/calendar/dayfinder")
    public DayOfWeekResponse findDayOfWeek(@RequestParam("date") String dateStr) {
        // Convertir la date  LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);

        // Récupérer le jour de la semaine correspondant à la date
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Créer la réponse
        DayOfWeekResponse response = new DayOfWeekResponse();
        response.setDate(date.toString());
        response.setDayOfWeek(dayOfWeek.toString());

        return response;
    }
}
