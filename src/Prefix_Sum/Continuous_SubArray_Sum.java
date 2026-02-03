package Prefix_Sum;

import java.util.HashMap;
import java.util.Map;

public class Continuous_SubArray_Sum {

    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int prefix = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix = (prefix + nums[i]) % k;

            if (map.containsKey(prefix)) {
                if (i - map.get(prefix) >= 2) {
                    return true;
                }
            } else {
                map.put(prefix, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Continuous_SubArray_Sum ob = new Continuous_SubArray_Sum();
        System.out.println(ob.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
    }
}
