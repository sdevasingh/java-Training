public class Prob8 {
    public int longestSubarray(int[] nums) {
        int l = 0, zero = 0, res = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) zero++;
            while (zero > 1) if (nums[l++] == 0) zero--;
            res = Math.max(res, r - l);
        }
        return res;
    }
}