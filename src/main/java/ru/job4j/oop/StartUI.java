package ru.job4j.oop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
}
