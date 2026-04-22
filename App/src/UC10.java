
import java.util.*;
        import java.util.stream.*;

public class UC10 {

    public static void main(String[] args) {

        // Creating list of bogies
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 40)
        );

        // Stream pipeline: map + reduce
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)   // extract capacity
                .reduce(0, Integer::sum);  // aggregate

        // Output
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}