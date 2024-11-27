public class OptimalMinimumSubsequence {
    public static int findOptimalSubsequenceSum(int[] arr) {
        // Check for invalid array sizes
        if (arr.length < 3) {
            return 0; // No peaks possible in an array of size < 3
        }
        
        int sum = 0;

        // Traverse from the second element to the second last element
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3, 1, 1};
        int result = findOptimalSubsequenceSum(arr);
        System.out.println("Optimal Minimum Subsequence Sum: " + result);
    }
}
