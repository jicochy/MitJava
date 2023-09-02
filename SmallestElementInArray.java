import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int smallest = findSmallestElement(arr);

        System.out.println("The smallest element in the array is: " + smallest);

        scanner.close();
    }

    public static int findSmallestElement(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
