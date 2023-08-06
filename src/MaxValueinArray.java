import java.util.Scanner;

public class MaxValueinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in array: ");
        input(arr);
        System.out.println("maximum element is: ");
        max(arr);
    }

    static void input(int[] arr){
        Scanner in = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
    }

    static void max(int[] arr){
        // Scanner in = new Scanner(System.in);
        int MaxVal = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>MaxVal){
                MaxVal = arr[i];

            }

        }
        System.out.println(MaxVal);
    }
}
