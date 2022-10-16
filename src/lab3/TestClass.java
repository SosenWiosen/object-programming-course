package lab3;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class TestClass {
    private static List<TestClass> instances = new ArrayList<>();

    private final Instant timeStamp = Instant.now();
    private int id = 0;

    TestClass() {
        instances.add(this);
        id = instances.size();
        System.out.println("Created instance with id: " + id + " at: " + timeStamp.toEpochMilli());
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided");
            return;
        } else {
            int numberOfInstances = Integer.parseInt(args[0]);
            for (int i = 0; i < numberOfInstances; i++) {
                new TestClass();
            }
        }


    }
}

