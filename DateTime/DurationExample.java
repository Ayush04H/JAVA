import java.time.Duration;
import java.time.LocalTime;
public class DurationExample {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(9,5);
        LocalTime end = LocalTime.of(12,0);
        Duration duration = Duration.between(start, end);

        long tomins = duration.toMinutes();
        long tohours = duration.toHours();
        long tosecs = duration.toSeconds();

        System.out.println("Duration Seconds : " + tosecs);
        System.out.println("Duration Minutes : " + tomins);
        System.out.println("Duration Hours : " + tohours);
        System.out.println("Duration Hours : " + duration);
        

    }
}
