package Stack;

import java.util.Arrays;

public class PriceWithDiscount {


        public int[] finalPrices(int[] prices) {

            int n = prices.length;

            int[] res = new int[n];

            int[] stack = new int[n + 1];
            int index = -1;

            for (int i = 0; i < n; i++) {
                while (index != -1 && prices[stack[index]] >= prices[i]) {
                    res[stack[index]] = prices[stack[index]] - prices[i];
                    index--;
                }
                stack[++index] = i;
            }

            while (index != -1) {
                res[stack[index]] = prices[stack[index]];
                index--;
            }

            return res;
        }

    public static void main(String[] args) {
        PriceWithDiscount ob = new PriceWithDiscount();
        System.out.println(Arrays.toString(ob.finalPrices(new int []{8,4,6,2,3})));
    }
}
