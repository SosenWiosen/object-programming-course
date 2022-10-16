package lab2;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Weekend2 {
    public static void main(String[] args) {
        int dayOfWeek = LocalDateTime.now().getDayOfWeek().getValue();
        if (dayOfWeek == 6 || dayOfWeek == 7) {
            System.out.println("It's the weekend!");
        } else {
            var daysLeftText = "There" + ((6 - dayOfWeek) > 1 ? " are " + (6 - dayOfWeek) +
                    " days left until the weekend." : " is 1 day left until the weekend.");
            System.out.println("It's " + LocalDateTime.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH) +
                    ". " + daysLeftText);
        }
    }
}
