import java.util.Scanner;

public class SwappingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        input(arr, n);
        System.out.println("Enter the first index number you want to swap: ");
        int x = in.nextInt();
        System.out.println("Enter the second index you want to swap: ");
        int y = in.nextInt();
        swap(arr, x, y);
        System.out.println("After swapping: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void input(int[] arr, int n) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

