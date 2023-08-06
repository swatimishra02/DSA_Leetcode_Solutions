import java.util.ArrayList;
import java.util.Arrays;

public class MinimumTimeToReachMaxSum {
    public static int minTimeToReachXSum(ArrayList<Integer> nums1, ArrayList<Integer> nums2, int x) {
        int n = nums1.size();
        int left = 0;
        int right = Integer.MAX_VALUE - 1; // Set the initial upper bound for binary search

        // Binary search to find the minimum time
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Calculate the sum after mid seconds
            long sum = 0;
            for (int i = 0; i < n; i++) {
                long value = nums1.get(i) + (long) mid * nums2.get(i);
                sum += value;
            }

            // Check if the sum is less than or equal to x
            if (sum <= x) {
                // If yes, check if we can further minimize the time by reducing the right boundary
                right = mid - 1;
            } else {
                // If not, we need to increment the left boundary to increase the time
                left = mid + 1;
            }
        }

        // Check if it's possible to reach the sum less than or equal to x
        // If not, return -1
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums1.get(i) + (long) left * nums2.get(i);
        }
        if (sum > x) {
            return -1;
        }

        return left;
    }

    public static void main(String[] args) {
        // Example usage:
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        int x = 4;
        int result = minTimeToReachXSum(nums1, nums2, x);
        System.out.println("Minimum time to reach sum <= " + x + " is: " + result);
    }
}
