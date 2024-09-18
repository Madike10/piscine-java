// package FormatDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.FRENCH);
        String formattedDate = dateTime.format(dateFormatter);
        return String.format("Le %s %s de l'an %s à %dh%dm et %ds",
                dateTime.getDayOfMonth(),
                dateTime.getMonth().name(),
                formattedDate.split(" ")[2],
                dateTime.getHour(),
                dateTime.getMinute(),
                dateTime.getSecond());
    }

    public static String formatSimple(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
        return date.format(formatter);
    }

    public static String formatIso(LocalTime time) {
        return time.toString();
    }
}