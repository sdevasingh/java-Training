import java.util.ArrayList;
import java.util.List;

public class Prob6 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        // Mark visited numbers by making the corresponding index negative
        for (int n : nums) {
            int idx = Math.abs(n) - 1;
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }

        // Collect indices that remain positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }

        return res;
    }
}