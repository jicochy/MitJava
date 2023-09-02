import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pattern Printing Menu:");
        System.out.println("1. Print Pyramid");
        System.out.println("2. Print Triangle");

        System.out.print("Enter your choice (1/2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        switch (choice) {
            case 1:
                printPyramid(numRows);
                break;
            case 2:
                printTriangle(numRows);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }

    public static void printPyramid(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
