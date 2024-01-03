package JavaDateAndTime.DisplayCurrentDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class DateAndTimeFormartting {
    public static void main (String [] Args) {
        LocalDateTime myDateObject = LocalDateTime.now();
        System.out.println("Local Date and Time before formarting: " + myDateObject);

        //using formatter class with the  ofPattern method
        DateTimeFormatter myFormatedObject = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        String formarttedObject = myDateObject.format(myFormatedObject);

        //print out date in new formart
        System.out.println("The firts date and time formart is : " + formarttedObject);

        //or
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("E,MMM dd yyyy");
        String myNewFormat = myDateObject.format(newFormat);
        System.out.println("The second date and time format is: " + myNewFormat );

        //or formart to dd/mm/yyyy
        DateTimeFormatter anotherFormat = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
        String thirdFormat = myDateObject.format(newFormat);
        System.out.println("The third date format is: " + thirdFormat);

        //or formart to dd-mmm-yyyy
        DateTimeFormatter fourthFormart = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
        String formart = myDateObject.format(newFormat);
        System.out.println("The forth date format is: " + formart);

    }

}
