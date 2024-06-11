import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to start the stopwatch...");
        scanner.nextLine();

        long startTime = System.nanoTime();

        System.out.println("Stopwatch started. Press Enter to stop the stopwatch...");
        scanner.nextLine();

        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;
        double elapsedTimeInSeconds = (double) elapsedTime / 1_000_000_000.0;

        System.out.println("Elapsed time: " + elapsedTimeInSeconds + " seconds");

        scanner.close();
    }
}

