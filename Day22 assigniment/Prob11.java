import java.util.HashMap;
import java.util.Map;

public class Prob11 {

    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int n : nums) {
            sum += n;

            // Handle negative sums correctly
            int mod = ((sum % k) + k) % k;

            count += map.getOrDefault(mod, 0);
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Prob11 obj = new Prob11();

        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        System.out.println(obj.subarraysDivByK(nums, k));
    }
}