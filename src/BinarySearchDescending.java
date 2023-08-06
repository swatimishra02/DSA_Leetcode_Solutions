import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BinarySearchDescending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in array: ");
        input(arr);
        System.out.println("enter target element: ");
        int target = in.nextInt();
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
    static void input(int[] arr){
        Scanner in = new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            arr[i]=in.nextInt();
        }
    }
    static int binarysearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(target>arr[mid]){
                high=mid-1;
            }
            else if(target<arr[mid]){
                low=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


}
