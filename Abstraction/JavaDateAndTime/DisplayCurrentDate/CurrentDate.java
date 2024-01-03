package JavaDateAndTime.DisplayCurrentDate;
import java.time.*;
//uses the now method on the .time package to display the current date 

public class CurrentDate {
    public static void main (String [] Args) {
        LocalDateTime today = LocalDateTime.now(); // create a date object

        //display current date 
        System.out.println("Date " + today.toLocalDate());

        //or
        LocalDate whichDay = LocalDate.now();
        System.out.println("When is today? " + whichDay);

        //to display the current time (hour , minute , seconds and nano secs) u
        System.out.println("Time " + today.toLocalTime());
        
        //or
        LocalTime whatTime = LocalTime.now();
        System.out.println(" What is the time ? "+ whatTime);

        



    }

}
