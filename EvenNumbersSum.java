import java.util.Scanner;

public class EvenNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) { // Check if the number is even
                sum += i;
            }
        }

        System.out.println("Sum of even numbers in the range from " + start + " to " + end + " is: " + sum);

        scanner.close();
    }
}
