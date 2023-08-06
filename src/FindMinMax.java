import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in array: ");
        input(arr);
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static void input(int[] arr){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                max = arr[i];
                // return max;
            }
        }
        return max;
    }
    static int min(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                min = arr[i];
            }
        }
        return min;
    }
}


