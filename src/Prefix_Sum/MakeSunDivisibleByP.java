package Prefix_Sum;

import java.util.HashMap;

public class MakeSunDivisibleByP {

    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long total = 0;

        for(int v : nums) total+=v;

        int rem = (int)(total%p);
        if(rem==0) return 0;

        long prefixSum = 0;
        int res = n;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<n;i++){
            prefixSum = (prefixSum + nums[i])%p;
            int curr = (int)prefixSum;

            int want = (int)(curr-rem+p)%p;
            if(map.containsKey(want)){
                res = Math.min(res,i-map.get(want));
            }
            map.put(curr,i);
        }

        return res == n ? -1 : res;

    }

    public static void main(String[] args) {
        MakeSunDivisibleByP obj = new MakeSunDivisibleByP();
        int[] nums = {3,1,4,1,5};
        int p = 5;
        System.out.println(obj.minSubarray(nums,p));
    }
}
//important