import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numInput = scanner.nextLine();

        if (numInput.matches("\\d+")) {  // Check if input is a positive number
            int num = Integer.parseInt(numInput);
            System.out.print("The Fibonacci Series is: ");

            int a = 0;
            int b = 1;

            if (num == 1) {
                System.out.print(a);
            } else if (num == 2) {
                System.out.print(a + ", " + b);
            } else {
                System.out.print(a + ", " + b);
                for (int i = 3; i <= num; i++) {
                    int c = a + b;
                    a = b;
                    b = c;
                    System.out.print(", " + c);
                }
            }
        } else {
            System.out.println("Invalid input. Enter a positive number");
        }
    }
}
