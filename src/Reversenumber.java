import java.util.Scanner;
public class Reversenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNum = reverseNumber(number);

        System.out.println("The reverse of the given number is " + reversedNum);

        scanner.close();
    }

    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}
