package Stack;

import java.util.Arrays;

public class DailyTemp {


        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int [] res = new int [n];

            int [] stack = new int [n+1];
            int index = -1;

            for(int i=0;i<n;i++){
                while(index !=-1 && temperatures[stack[index]]<temperatures[i]){
                    res[stack[index]] = i - stack[index];
                    index--;
                }
                stack[++index] = i;
            }

            // while(index != -1){
            //     res[stack[index]] = 0;
            //     index--;
            // }
            return res;
        }

    public static void main(String[] args) {
        DailyTemp ob = new DailyTemp();
        System.out.println(Arrays.toString(ob.dailyTemperatures(new int []{73,74,75,71,69,72,76,73})));
    }
}
