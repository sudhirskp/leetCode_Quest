package Hash;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                return new int []{map.get(rem),i};
            }
            map.put(nums[i],i);
        }
        return new int []{};
    }
    public static void main(String[] args) {
        TwoSum ob = new TwoSum();
        System.out.println((Arrays.toString((ob.twoSum(new int[]{3,2,4},6)))));
    }
}
