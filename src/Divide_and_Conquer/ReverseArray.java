package Divide_and_Conquer;

import java.util.Arrays;

public class ReverseArray {

    public int reversePairs(int[] nums) {
        return mergeReverse(nums, 0, nums.length - 1);
    }

    private int mergeReverse(int[] nums, int l, int r) {
        if (l >= r)
            return 0;
        int mid = l + (r - l) / 2;
        int count = 0;

        count += mergeReverse(nums, l, mid);
        count += mergeReverse(nums, mid+1, r);

        int j = mid+1;

        for(int i =l;i<mid+1;i++){
            while(j<=r && nums[i]>2L*nums[j]){
                j++;
            }
            count+=(j-(mid+1));
        }

        //Arrays.sort(nums,l,r+1);
        merge(nums,l,mid,r);
        return count;
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        int [] temp = new int [nums.length];
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        for (int p = left; p <= right; p++) {
            nums[p] = temp[p];
        }
    }

    public static void main(String[] args) {
        ReverseArray ob = new ReverseArray();
        int [] nums = {1,3,2,3,1};
        System.out.println(ob.reversePairs(nums));
    }
}
// Time Complexity: O(nlogn)
// Space Complexity: O(n)