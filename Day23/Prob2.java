public class Prob2 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];
        int max = sum;
        for (int i = k; i < nums.length; i++)
            max = Math.max(max, sum += nums[i] - nums[i-k]);
        return max * 1.0 / k;
    }
}