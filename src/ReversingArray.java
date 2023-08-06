import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = in.nextInt();
        System.out.print("enter elements in array: ");
        int[] arr = new int[n];
        input(arr);
        System.out.println("after reversing the array: ");
        reverse(arr, n);
    }

    static void input(int[] arr){
        Scanner in = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
    }
    static void reverse(int[] arr, int n){

        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Scanner in = new Scanner(System.in);
//        int[] newarr = new int[n];
//        for (int i=arr.length-1; i>-1; i--){
//            for(int j=0; j<newarr.length ;j++){
//                arr[i] = newarr[j];
//            }
//        }
        // System.out.println(newarr);
    }
}
