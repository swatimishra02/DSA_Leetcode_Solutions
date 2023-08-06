import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in the array: ");
        input(arr);
        System.out.println("enter the element to be searched: ");
        int m = in.nextInt();
        int result = search(arr,m);
        if(result == -1){
            System.out.println("element not found");
        }
    }
    static void input(int[] arr){
        Scanner in = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
    }
    static int search(int[] arr, int m){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==m) {
                System.out.println("element exists at " + i + " index");
                return i;

            }
        }
        return -1;
    }
}
