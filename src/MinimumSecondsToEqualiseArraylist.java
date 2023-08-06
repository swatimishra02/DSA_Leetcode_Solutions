import java.util.ArrayList;

public class MinimumSecondsToEqualiseArraylist {

    public static int minSecondsToEqualize(ArrayList<Integer> nums) {
        int n = nums.size();
        int minSeconds = 0;

        while (!allElementsEqual(nums)) {
            ArrayList<Integer> temp = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {
                int minValue = Math.min(nums.get(i), Math.min(nums.get((i - 1 + n) % n), nums.get((i + 1) % n)));
                temp.add(minValue);
            }

            nums = temp;
            minSeconds++;
        }

        return minSeconds;
    }

    private static boolean allElementsEqual(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            if (!nums.get(i).equals(nums.get(i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(11);
        nums.add(7);
        nums.add(5);
        // nums.add(2);

        int minSeconds = minSecondsToEqualize(nums);
        System.out.println("Minimum seconds needed to make all elements equal: " + minSeconds);
    }
}
