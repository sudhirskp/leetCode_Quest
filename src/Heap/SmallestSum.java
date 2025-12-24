package Heap;

import java.util.ArrayList;
import java.util.*;
import java.util.PriorityQueue;

public class SmallestSum {


        public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            int n = nums1.length;

            PriorityQueue<int[]> que = new PriorityQueue<>((a, b) ->
                    (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
            );

            for (int i = 0; i < Math.min(nums1.length, k); i++) {
                que.offer(new int[]{i, 0});
            }

            while (!que.isEmpty()) {
                int[] num = que.poll();
                int i = num[0], j = num[1];
                //List<Integer> list = new ArrayList<>();
                // list.add(nums1[i]);
                // list.add(nums2[j]);
                ans.add(Arrays.asList(nums1[i], nums2[j]));

                if (j + 1 < nums2.length) {
                    que.offer(new int[]{i, j + 1});
                    j++;
                }


                if (ans.size() == k) break;
            }
            return ans;
        }


    public static void main(String[] args) {
        SmallestSum ob = new SmallestSum();
        System.out.println(ob.kSmallestPairs(new int []{1,7,11},new int []{2,4,6},3));
    }
}
