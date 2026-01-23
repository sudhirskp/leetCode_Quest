package Hash;

import java.util.HashSet;

public class FindFirstMissing {

    //SC - O(1), TC - O(n)
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for(int i=0;i<n;i++){

            while(nums[i] >= 1 && nums[i]<=n && nums[nums[i]-1] != nums[i]){
                int ind = nums[i]-1;
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }

    //Sc - O(n) TC - O(n)
    public int firstMissingPositive2(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int v : nums){
            set.add(v);
        }

        for(int i=0;i<n;i++){
            if(!set.contains(i+1)) return i+1;
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0};
        FindFirstMissing obj = new FindFirstMissing();
        System.out.println(obj.firstMissingPositive2(arr));
    }
}
