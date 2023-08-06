import java.util.Scanner;
// find ceiling of the target element
public class FindCeiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in array: ");
        input(arr);
        System.out.println("enter target element: ");
        int target = in.nextInt();
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static void input(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    }
    static int ceiling(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid+1;    // if the element exists in the array, its ceiling will be the next number
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;     // after searching for the target element in all iterations, low will be mid+1, giving ceiling of the target
    }
}

