package lab2;

public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Number of args: " + args.length);
        int idx = 0;
        // To trza puścić osobno z cli
        //
        for (String arg : args) {
            System.out.println("The " + idx++ + " argument is: `" + arg + "`");
        }
    }
}
