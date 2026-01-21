public class BruteForce {

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxAvg = Double.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            double tempSum = 0, tempAvg = 0;
            for( int j = i; j < i + k; j++) {
                tempSum += nums[j];
            }
            tempAvg = tempSum / k;
            maxAvg = Math.max(maxAvg, tempAvg);
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println("Maximum average subarray of length " + k + " is: " + findMaxAverage(nums, k));
    }  
}
