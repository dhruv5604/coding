public class BruteForce {
    public static int findMaxSumSubarray(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i <= n - k; i++) {
            int currentSum = 0;
            for (int j = 0; j < k; j++) {
                currentSum += arr[i + j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxSum = findMaxSumSubarray(arr, k);
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum);
    }
}