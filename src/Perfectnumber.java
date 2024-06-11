import java.util.Scanner;
public class Perfectnumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        String numInput = scanner.nextLine();

        if (numInput.matches("\\d+")) {
            int num = Integer.parseInt(numInput); // Convert the input to an integer

            if (num <= 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            } else {
                int divisorSum = 0;

                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        divisorSum += i;
                    }
                }

                if (divisorSum == num) {
                    System.out.println(num + " is a perfect number.");
                } else {
                    System.out.println(num + " is not a perfect number.");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        scanner.close();
    }
}