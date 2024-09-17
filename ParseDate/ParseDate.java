// package ParseDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
       return (stringDate == null) ? null : LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.FRENCH);
    return LocalDate.parse(stringDate, formatter);
}

    public static LocalTime parseTimeFormat(String stringDate) {
        if(stringDate == null) {
            return null;
        }
        String[] parts = stringDate.split(", ");
        String[] hourPart = parts[0].split(" ");
        String[] minutePart = parts[1].split(" et ");
        
        int hour = Integer.parseInt(hourPart[0]);
        int minute = Integer.parseInt(minutePart[0].split(" ")[0]);
        int second = Integer.parseInt(minutePart[1].split(" ")[0]);

        if (stringDate.contains("du soir") && hour < 12) {
            hour += 12;
        }

        return LocalTime.of(hour, minute, second);
    }

}
