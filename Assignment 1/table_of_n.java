import java.util.Scanner;

public class table_of_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " X " + i + " = " + result);
        }
    }
}
