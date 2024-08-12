package java8Features;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeApiExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = localDateTime.format(formatter);
        System.out.println(formattedDate);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZonedDateTime specificZonedDateTime = ZonedDateTime.of(2024, 7, 24, 12, 30, 0, 0, ZoneId.of("Europe/London"));
        System.out.println(specificZonedDateTime);
    }
}
