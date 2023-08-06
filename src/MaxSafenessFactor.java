import java.util.LinkedList;
import java.util.Queue;

class Cell {
    int r;
    int c;
    int safenessFactor;

    public Cell(int r, int c, int safenessFactor) {
        this.r = r;
        this.c = c;
        this.safenessFactor = safenessFactor;
    }
}

public class MaxSafenessFactor {
    public int maxSafenessFactor(int[][] grid) {
        int n = grid.length;

        // If the starting or ending cell contains a thief, return -1 as it's not possible to reach the destination.
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        // Arrays to store visited cells and safeness factors
        boolean[][] visited = new boolean[n][n];
        int[][] safenessFactors = new int[n][n];

        // Initialize BFS queue and add the starting cell with safeness factor 0
        Queue<Cell> queue = new LinkedList<>();
        queue.offer(new Cell(0, 0, Integer.MAX_VALUE));

        // Define directions: right, left, down, up
        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0};

        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            int r = cell.r;
            int c = cell.c;
            int safenessFactor = cell.safenessFactor;

            // Check if the current cell is the destination cell
            if (r == n - 1 && c == n - 1) {
                return safenessFactor;
            }

            // Mark the current cell as visited
            visited[r][c] = true;

            // Update safenessFactor for the current cell
            safenessFactors[r][c] = safenessFactor;

            // Explore adjacent cells
            for (int i = 0; i < 4; i++) {
                int newR = r + dr[i];
                int newC = c + dc[i];

                if (newR >= 0 && newR < n && newC >= 0 && newC < n && !visited[newR][newC]) {
                    int newSafenessFactor = Math.min(safenessFactor, manhattanDistanceToThief(grid, newR, newC));
                    queue.offer(new Cell(newR, newC, newSafenessFactor));
                }
            }
        }

        // If the destination cell is not reachable, return -1
        return -1;
    }

    private int manhattanDistanceToThief(int[][] grid, int r, int c) {
        int n = grid.length;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int distance = Math.abs(i - r) + Math.abs(j - c);
                    minDistance = Math.min(minDistance, distance);
                }
            }
        }

        return minDistance;
    }

    public static void main(String[] args) {
        MaxSafenessFactor solution = new MaxSafenessFactor();
        int[][] grid = {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 1}
        };

        int maxSafeness = solution.maxSafenessFactor(grid);
        System.out.println("Maximum Safeness Factor: " + maxSafeness);
    }
}
