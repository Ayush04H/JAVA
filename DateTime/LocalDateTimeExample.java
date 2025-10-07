
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime : " + now);

        LocalDateTime random = LocalDateTime.of(1999, Month.APRIL, 12, 4, 0, 0);
        System.out.println("Random DateTime Using of method : " + random);

        LocalDate date = LocalDate.of(2019, Month.JULY, 14);
        LocalTime time = LocalTime.of(4, 30, 05);
        LocalDateTime combined = LocalDateTime.of(date, time);
        System.out.println("Combined Date and Time : " + combined);

        //Addition 
        LocalDateTime addedval = random.plusDays(2).plusHours(2);
        System.out.println("Added Value to Random : " + addedval);
    }
}
