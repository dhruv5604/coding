public class OptimalSol {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxAvg, windowSum = 0;
        
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        maxAvg = windowSum / k;

        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];
            maxAvg = Math.max(windowSum / k, maxAvg);
        }

        return maxAvg;
    }
    public static void main(String[] args) {
        int[] nums = {5};
        int k = 1;

        System.out.println("Maximum average subarray of length " + k + " is: " + findMaxAverage(nums, k));
    }    
}
