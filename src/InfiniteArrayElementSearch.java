import java.util.Scanner;

public class InfiniteArrayElementSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in array: ");
        input(arr);
        System.out.println("enter target element: ");
        int target = in.nextInt();
        // int ans = InfiniteBS(arr, target, start, end);
        // System.out.println(ans);

    }
    static void input(int[] arr){
        Scanner in = new Scanner(System.in);
        for(int i=0; i<arr.length;i++){
            arr[i]=in.nextInt();
        }
    }

    static int FindingRange(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end+1;
            end = end + (end-start + 1)*2;
            start = newStart;
        }
        return InfiniteBS(arr, target, start, end);
    }
    static int InfiniteBS(int[] arr, int target, int start, int end){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(target<arr[mid]){
                high=mid-1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}




