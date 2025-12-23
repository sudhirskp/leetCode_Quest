package Arrays;

import java.util.Arrays;
import java.util.Set;

public class SetMissMatch {


        public int[] findErrorNums(int[] nums) {
            int n = nums.length;
            int[] count = new int[n + 1];
            int miss =0;
            int dupli =0;

            for (int v : nums) {
                count[v]++;
            }

            for (int i = 1; i <= n; i++) {
                if (count[i] == 2) {
                    dupli = i;
                } else if (count[i] == 0) {
                    miss = i;
                }
                if(miss!=0 && dupli!=0) break;
            }

            return new int []{dupli,miss};
        }

    public static void main(String[] args) {
        SetMissMatch ob = new SetMissMatch();
        System.out.println(Arrays.toString(ob.findErrorNums(new int []{1,2,2,4})));
    }
}
