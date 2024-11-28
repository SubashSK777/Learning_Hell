public class OptimalMinimumSubsequence {
    public static int findOptimalSubsequenceSum(int[] arr) {
        // Check for invalid array sizes
        if (arr.length < 3) {
            return 0; // No valid subsequences possible
        }

        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // Find the smallest left neighbor
            int leftNeighbor = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    leftNeighbor = Math.min(leftNeighbor, arr[j]);
                }
            }

            // Find the smallest right neighbor
            int rightNeighbor = Integer.MAX_VALUE;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] < arr[i]) {
                    rightNeighbor = Math.min(rightNeighbor, arr[k]);
                }
            }

            // If valid neighbors exist, calculate the sum
            if (leftNeighbor != Integer.MAX_VALUE && rightNeighbor != Integer.MAX_VALUE) {
                int currentSum = leftNeighbor + arr[i] + rightNeighbor;
                minSum = Math.min(minSum, currentSum);
            }
        }

        // If no valid peaks were found, return 0
        return minSum == Integer.MAX_VALUE ? 0 : minSum;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3, 1, 1};
        int result = findOptimalSubsequenceSum(arr);
        System.out.println("Optimal Minimum Subsequence Sum: " + result);
    }
}
