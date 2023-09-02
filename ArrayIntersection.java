import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        findIntersection(arr1, arr2);

        scanner.close();
    }

    public static void findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }

        if (commonElements.isEmpty()) {
            System.out.println("There are no common elements.");
        } else {
            System.out.println("Common elements in the two arrays:");
            for (int num : commonElements) {
                System.out.println(num);
            }
        }
    }
}
