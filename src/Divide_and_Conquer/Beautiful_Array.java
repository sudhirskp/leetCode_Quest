package Divide_and_Conquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Beautiful_Array {

    public int[] beautifulArray(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(1);

        while (res.size() < n) {
            List<Integer> temp = new ArrayList<>();

            for (int x : res) {
                if (2 * x - 1 <= n) temp.add(2 * x - 1);
            }
            for (int x : res) {
                if (2 * x <= n) temp.add(2 * x);
            }

            res = temp;
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) ans[i] = res.get(i);
        return ans;
    }

    public static void main(String[] args) {
        Beautiful_Array ob = new Beautiful_Array();
        System.out.println(Arrays.toString(ob.beautifulArray(5)));
    }
}
