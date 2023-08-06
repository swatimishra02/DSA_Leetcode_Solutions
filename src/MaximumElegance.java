import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class MaximumElegance {

    public int maxElegance(int[][] items, int k) {
        int n = items.length;
        int maxElegance = 0;

        // Sort the items array based on profit (decreasing order)
        Arrays.sort(items, (a, b) -> b[0] - a[0]);

        maxElegance = getMaxElegance(items, 0, k, new HashSet<>());

        return maxElegance;
    }

    private int getMaxElegance(int[][] items, int start, int k, Set<Integer> distinctCategories) {
        if (k == 0) {
            int totalProfit = 0;
            for (int i = start; i < items.length; i++) {
                if (distinctCategories.contains(items[i][1])) continue;
                totalProfit += items[i][0];
                distinctCategories.add(items[i][1]);
            }
            return totalProfit + distinctCategories.size() * distinctCategories.size();
        }

        if (start == items.length) {
            return 0;
        }

        // Include the current item and move to the next item with k-1 size
        distinctCategories.add(items[start][1]);
        int maxEleganceWithItem = items[start][0] + getMaxElegance(items, start + 1, k - 1, distinctCategories);
        distinctCategories.remove(items[start][1]);

        // Exclude the current item and move to the next item with k size
        int maxEleganceWithoutItem = getMaxElegance(items, start + 1, k, distinctCategories);

        // Choose the maximum of the two options
        int maxElegance = Math.max(maxEleganceWithItem, maxEleganceWithoutItem);

        return maxElegance;
    }

    public static void main(String[] args) {
        int[][] items1 = {{3, 2}, {5, 1}, {10, 1}};
        int k1 = 2;
        MaximumElegance solution1 = new MaximumElegance();
        int maxElegance1 = solution1.maxElegance(items1, k1);
        System.out.println("Maximum elegance 1: " + maxElegance1); // Output: 17

        int[][] items2 = {{3, 1}, {3, 1}, {2, 2}, {5, 3}};
        int k2 = 3;
        MaximumElegance solution2 = new MaximumElegance();
        int maxElegance2 = solution2.maxElegance(items2, k2);
        System.out.println("Maximum elegance 2: " + maxElegance2); // Output: 19

        int[][] items3 = {{1, 1}, {2, 1}, {3, 1}};
        int k3 = 3;
        MaximumElegance solution3 = new MaximumElegance();
        int maxElegance3 = solution3.maxElegance(items3, k3);
        System.out.println("Maximum elegance 3: " + maxElegance3); // Output: 7
    }
}
