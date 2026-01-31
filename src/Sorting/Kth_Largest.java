package Sorting;

import java.util.PriorityQueue;

public class Kth_Largest {

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            if(que.size()<=k){
                que.offer(nums[i]);
            }

            if(que.size()>k){
                que.poll();
            }
        }
        return que.poll();
    }

    public static void main(String[] args) {
        Kth_Largest ob = new Kth_Largest();
        int [] nums = {3,2,1,5,6,4};
        System.out.println(ob.findKthLargest(nums, 2));
    }
}
