package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MergeInterval {

    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n==1) return intervals;

        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        List<int[]> ans = new ArrayList<>();

        //System.out.print(Arrays.deepToString(intervals));

        int [] curr = intervals[0];
        for(int i =1;i<n;i++){
            if(curr[1]>=intervals[i][0]){
                curr[1] = Math.max(curr[1],intervals[i][1]);
            }else{
                ans.add(curr);
                curr = intervals[i];
            }
        }
        ans.add(curr);

        int [][] res = new int [ans.size()][2];
        int j = 0;
        for(int [] v: ans){
            res[j++] = v;
        }

        return res;
    }
    public static void main(String[] args) {
        MergeInterval ob = new MergeInterval();
        int [][] arr = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(ob.merge(arr)));
    }
}
