import java.util.Scanner;

public class spy_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        int originalNumber = number;
        int sumOfDigits = 0;
        int productOfDigits = 1;

        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }

        boolean isSpyNumber = (sumOfDigits == productOfDigits);

        if (isSpyNumber) {
            System.out.println(originalNumber + " is a Spy Number.");
        } else {
            System.out.println(originalNumber + " is not a Spy Number.");
        }
    }
}
