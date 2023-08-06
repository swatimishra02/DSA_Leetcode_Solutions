import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array (in ascending or descending order): ");
        input(arr);
        System.out.println("Enter target element: ");
        int target = in.nextInt();
        int ans = orderAgnosticBinarySearch(arr, target);
        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    static void input(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        boolean isAsc = arr[0] < arr[arr.length - 1];
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
