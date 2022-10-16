package Lab_3;

import java.util.Arrays;

public class ArithmeticMean {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No arguments provided");
            return;
        } else {
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("The mean average of the numbers: " + Arrays.stream(args).toList().toString() + " is: " + sum / args.length);
        }
    }
}
