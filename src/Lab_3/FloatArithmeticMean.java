package Lab_3;

public class FloatArithmeticMean {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided");
            return;
        } else {
            float sum = 0;
            for (String arg : args) {
                System.out.printf("%10.3f \n", Float.parseFloat(arg));
                sum += Float.parseFloat(arg);
            }
            System.out.printf("=".repeat(10) + "\n");
            System.out.printf("%10.3f \n \n", sum);
            System.out.printf("The mean average is %.3f \n", sum / args.length);
        }
    }
}