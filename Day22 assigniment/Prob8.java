import java.util.HashMap;
import java.util.Map;

public class Prob8 {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            // Treat 0 as -1 and 1 as +1
            sum += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Prob8 obj = new Prob8();

        int[] nums = {0, 1, 0, 1, 1, 1, 0};

        System.out.println(obj.findMaxLength(nums));
    }
}