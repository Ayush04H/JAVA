
import java.time.LocalTime;


public class LocalTimeExample {

    public static void main(String[] args) {
        // Current Time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time : "+now);

        // Random Time 
        LocalTime random = LocalTime.of(12,5,6);
        System.out.println("Random Time using of Method : " + random);

        //Manipulations 

        //Addition of Hours
        LocalTime randomplus = random.plusHours(2);
        System.out.println("Random Time + 2hrs : " +randomplus);

        //Addition of Minutes 
        LocalTime randomminplus = random.plusMinutes(5);
        System.out.println("Random Time + 5 mins added : " + randomminplus);

        //Addition of Seconds 
        LocalTime randomsecplus = random.plusSeconds(4);
        System.out.println("Random Time + 4 Seconds added : " + randomsecplus);
    }
}
