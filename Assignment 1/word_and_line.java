import java.util.Scanner;

public class word_and_line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next();

        System.out.print("Enter a line: ");
        scanner.nextLine();
        String line = scanner.nextLine();

        scanner.close();

        String result = word + " " + line;
        System.out.println("Concatenated: " + result);
    }
}
