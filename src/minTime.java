public class minTime {
    public int minimumTime(int[] nums1, int[] nums2, int x) {
        int n = nums1.length;
        int left = 0;
        int right = Integer.MAX_VALUE - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long sum = 0;
            for (int i = 0; i < n; i++) {
                long value = (long) nums1[i] + (long) mid * (long) nums2[i];
                sum += value;
            }

            if (sum <= x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }


        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long) nums1[i] + (long) left * (long) nums2[i];
        }
        if (sum > x) {
            return -1;
        }

        return left;
    }
}

