package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MinDiff {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();


        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        MinDiff ob = new MinDiff();
        int [] arr = {1,2,3,4,5,6};
        System.out.println(ob.minimumAbsDifference(arr));
    }
}
