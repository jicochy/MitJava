import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = calculateStringLength(inputString);

        System.out.println("Length of the string: " + length);

        scanner.close();
    }

    public static int calculateStringLength(String str) {
        return str.length();
    }
}
