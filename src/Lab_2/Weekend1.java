package Lab_2;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Weekend1 {
    public static void main(String[] args) {

        // The JAVA way of printing out the day of the week
        var dayOfWeek = LocalDateTime.now().getDayOfWeek();
        System.out.println("Today is " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH));

        //Exapmle of how to do it with switch case
        int dayOfWeekValue = dayOfWeek.getValue();
        switch(dayOfWeekValue){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
        }

    }
}
