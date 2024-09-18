package FormatDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.FRENCH);
        String formattedDate = dateTime.format(dateFormatter);
        return String.format("Le %s %s de l'an %s à %dh%dm et %ds",
                dateTime.getDayOfMonth(),
                dateTime.getMonth().getDisplayName(TextStyle.SHORT, Locale.FRENCH),
                formattedDate.split(" ")[2],
                dateTime.getHour(),
                dateTime.getMinute(),
                dateTime.getSecond());
    }

    public static String formatSimple(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
        return (date == null) ? null : date.format(formatter);
    }

    public static String formatIso(LocalTime time) {
        return  (time == null) ? null : time.toString();
    }
}