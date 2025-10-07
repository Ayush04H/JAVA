import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample{
    public static void main(String args[]){


        //To Print Local Date Of Present Day
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date :" + today);

        //To Print a Local Date 
        LocalDate random = LocalDate.of(1949,2, 24);
        System.out.println("Random LocalDate :" +random);

        // Parse String to Date 
        LocalDate parseing = LocalDate.parse("1999-01-31");
        System.out.println("Pasing String to Date :" + parseing);

        // manipulation in time 

        // Addition or Days
        LocalDate onedayfromnow = today.plusDays(1);
        System.out.println("Addition of Days :" + onedayfromnow);

        //Substraction of Days 
        LocalDate onedaybeforenow = today.minusDays(1);
        System.out.println("Substraction Of Days :" + onedaybeforenow);

        //Addition of Weeks
        LocalDate oneweekafter = today.plusWeeks(2);
        System.out.println("After Addition of Two Weeks :" +oneweekafter);

        //Addition Of Months
        LocalDate onemonthafter = today.plusMonths(2);
        System.out.println("After Two Months :" + onemonthafter);
        
        //Addition Of Years
        LocalDate oneyearafter = today.plusYears(1);
        System.out.println("One Year After :" + oneyearafter);

        //Getting Different Parts of Date 
        int year = today.getYear();
        Month month = today.getMonth();
        int day = today.getDayOfMonth();
        DayOfWeek week = today.getDayOfWeek();

        System.out.println("Year : " + year + ", Month : " + month + ", Day : " +day + " , And is the " +week);

        //To Find out Is Before or After
        System.out.println("Today is before one weekafter " +today.isBefore(oneweekafter));
        System.out.println("Today is after one weekafter " +today.isAfter(oneweekafter));

        
    }
}