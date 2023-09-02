import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of positions to rotate (positive for right, negative for left): ");
        int positions = scanner.nextInt();

        int[] rotatedArray = rotateArray(arr, positions);

        System.out.println("Array after rotation:");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static int[] rotateArray(int[] arr, int positions) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + positions) % n;
            if (newIndex < 0) {
                newIndex += n;
            }
            rotatedArray[newIndex] = arr[i];
        }

        return rotatedArray;
    }
}
