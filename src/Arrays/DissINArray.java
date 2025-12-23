package Arrays;

import java.util.ArrayList;
import java.util.List;

public class DissINArray {


    //important
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int n = nums.length;
            List<Integer> res = new ArrayList<>();

            for(int val : nums){
                int index = Math.abs(val)-1;
                nums[index] = - (Math.abs(nums[index]));
            }

            for(int i=0;i<n;i++){
                if(nums[i]>0){
                    res.add(i+1);
                }
            }

            return res;

        }

    public static void main(String[] args) {
        DissINArray ob = new DissINArray();
        System.out.println(ob.findDisappearedNumbers(new int []{4,3,2,7,8,2,3,1}));
    }
}
