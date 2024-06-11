import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrime(num);

        // Output
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        scanner.close();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // If divisible by any number other than 1 and itself, it's not prime
        }
        return true;
    }
}
