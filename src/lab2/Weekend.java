package lab2;

import java.time.LocalDateTime;

class Weekend {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int dayOfWeek = now.getDayOfWeek().getValue();
        if (dayOfWeek == 6 || dayOfWeek == 7) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("Dayse left until the weekend: " + (6 - dayOfWeek));
        }
    }
}