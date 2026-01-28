package Sorting;
import java.util.Arrays;
public class ArrayEleEqual {

    public int reductionOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                count += n - i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayEleEqual ob = new ArrayEleEqual();
        int [] nums = {2,3,4,1,6};
        System.out.println(ob.reductionOperations(nums));
    }
}
