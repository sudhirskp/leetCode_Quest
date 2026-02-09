package Divide_and_Conquer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Right_Interval {

    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        List<int[]> ls = new ArrayList<>();

        for(int i =0;i<n;i++){
            ls.add(new int []{intervals[i][0],i});
        }

        Collections.sort(ls, (a, b) -> Integer.compare(a[0], b[0]));
        //System.out.print(ls.toString());

        int [] ans = new int [n];
        for(int i =0;i<n;i++){
            ans[i] = find(ls,intervals[i][1]);
        }
        return ans;
    }



    private int find(List<int[]> ls, int end){
        int l = 0;
        int r = ls.size() - 1;
        int res = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (ls.get(mid)[0] >= end) {
                res = ls.get(mid)[1];
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Right_Interval ob = new Right_Interval();
        System.out.println(Arrays.toString(ob.findRightInterval(new int[][]{{3,4},{2,3},{1,2}})));
    }
}
