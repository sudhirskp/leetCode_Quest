package Stack;

import java.util.List;
import java.util.Arrays;

public class TimeOfFunctions {


        public int[] exclusiveTime(int n, List<String> logs) {
            //Stack<Integer> stack = new Stack<>();
            int [] stack = new int [501];
            int index = -1;
            int [] exl = new int [n];
            int pre = 0;


            for ( String str : logs){

                String [] log = str.split(":");
                //log[0] -> id , log[1] -> type , log[2] -> time
                int id = Integer.parseInt(log[0]);
                int time = Integer.parseInt(log[2]);

                if(log[1].equals("start")){
                    if(index!=-1){
                        int runfun = stack[index];
                        exl[runfun] += time - pre;
                    }
                    stack[++index]=id;
                    pre = time;
                }else{
                    int finfun = stack[index--];
                    exl[finfun] += time - pre + 1;
                    pre = time + 1;
                }
            }
            return exl;

        }

    public static void main(String[] args) {
        TimeOfFunctions ob = new TimeOfFunctions();
        System.out.println(Arrays.toString(ob.exclusiveTime(2, List.of("0:start:0","1:start:2","1:end:5","0:end:6"))));
    }
}
