// package DifferenceBetweenDate;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
        if(localTime1 == null){
            return null;
        }
        System.out.println(localTime1);
        System.out.println("****" + localTime2);
        Duration duration = Duration.between(localTime1, localTime2);
        return duration.isNegative() ? duration.abs() : duration;
    }

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        Period period = Period.between(date1, date2);
        return period.isNegative() ? period.negated() : period;
    }

    public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        Duration duration = Duration.between(dateTime1, dateTime2);
        return Math.abs(duration.toHours());
    }

}
