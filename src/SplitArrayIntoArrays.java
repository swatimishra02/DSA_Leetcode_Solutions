public class SplitArrayIntoArrays {
    public static boolean splitArray(int[] nums, int m, int n) {
        return backtrack(nums, 0, m, n - 1);
    }

    private static boolean backtrack(int[] nums, int index, int m, int n) {
        if (n == 0) {
            return true;
        }
        if (index == nums.length) {
            return false;
        }

        int sumSoFar = 0;
        for (int i = index; i < nums.length; i++) {
            sumSoFar += nums[i];
            if (sumSoFar >= m) {
                if (backtrack(nums, i + 1, m, n - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int m = 15;
        int n = 3;
        System.out.println(splitArray(nums, m, n)); // Output: true
    }
}

