import java.util.Scanner;

public class LinearSearchInRange {
    public static void main(String[] args) {
        // Q: searching an element in a range
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in array: ");
        input(arr, n);
        System.out.println("enter range: ");
        int p = in.nextInt();
        int q = in.nextInt();
        System.out.println("enter element to be found: ");
        int x = in.nextInt();
        range(arr, p, q ,x);
    }
    static void input(int[] arr, int n){
        Scanner in = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
    }
    static void range(int[] arr, int p, int q, int x){
        for(int i=p; i<=q; i++){
            if (arr[i] == x){
                System.out.println("element found in index: "+ i);
                return;
            }
        }
        System.out.println("element does not exist in the range");
    }
}
