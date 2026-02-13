package Two_Pointers;
import java.util.Arrays;
public class SumCLose {

    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int close = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length-2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(close - target)) {
                    close = sum;
                } else if (sum < target)
                    l++;
                else if (sum > target)
                    r--;
                else
                    return sum;
            }
        }
        return close;
    }

    public static void main(String[] args) {
        SumCLose ob = new SumCLose();
        int [] nums = {1,2,4,8,16};
        System.out.println(ob.threeSumClosest(nums, 6));
    }
}
