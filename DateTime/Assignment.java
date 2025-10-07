
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Assignment {
    public static void main(String[] args) {
        LocalDate currDate = LocalDate.of(2024,Month.MAY,22);
        LocalTime clockinTime = LocalTime.of(8,47,0);
        LocalTime clockouttime = LocalTime.of(17,32,0);
        LocalTime workstarTime = LocalTime.of(9,0,0);
        LocalTime workendTime  = LocalTime.of(17,0,0);
        LocalTime Unppaidbreak = LocalTime.of(0,45);
        int minutesbreak = Unppaidbreak.getMinute();

        System.out.println("Employee Clock - In: " + LocalDateTime.of(currDate,clockinTime));
        System.out.println("Employee Clock - Out: " + LocalDateTime.of(currDate,clockouttime));

        System.out.println("Was Employee Late? " +workstarTime.isBefore(clockinTime));
        System.out.println("Did Employee Leave Early? " +workendTime.isAfter(clockouttime));

        Duration totalofficetime = Duration.between(clockinTime, clockouttime);
        int totalofficehourspart = totalofficetime.toHoursPart();
        int totalofficeminspart = totalofficetime.toMinutesPart();

        System.out.println("Total Time at Office: " + totalofficehourspart + " hours and "+totalofficeminspart + " minutes");

        LocalTime productiveBase = LocalTime.of(totalofficehourspart,totalofficeminspart).minusMinutes(minutesbreak);
        System.out.println("Productive Work Hours: "+productiveBase.getHour() + " hours and " +productiveBase.getMinute() + " minutes");

        
        Duration standardworkhour = Duration.between(workstarTime, workendTime);
        int standardhours = standardworkhour.toHoursPart();
        int standardmins = standardworkhour.toMinutesPart();

        System.out.println("Standard Work Hours: "+standardhours + " hours and "+ standardmins + " minutes");
        LocalTime standard = LocalTime.of(standardhours,standardmins);

        Duration overtime = Duration.between(standard, productiveBase);
        //long overtimehour = overtime.toHours();

        LocalTime midnight = LocalTime.MIN;
        LocalTime overTime2 = midnight.plus(overtime);

        System.out.println("Overtime Worked: " + overTime2.getHour() + " hours and " + overTime2.getMinute());


    }
}
