package Stack;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStack {


        public List<String> buildArray(int[] target, int n) {
            List<String> res = new ArrayList<>();
            //List<Integer> list = new ArrayList<>();
            //Stack<Integer> stk = new Stack<>();
            // int [] stack = new int [n];
            int index = 0;
            int last = target[target.length-1];

            // for(int i=0;i<target.length;i++){
            //     list.add(target[i]);
            // }

            //System.out.print(list);

            for(int i=1;i<=last;i++){
                //stk.push(i);
                //stack[++index] = i;

                // if(list.contains(stack[index])){
                //     res.add("Push");
                // }else{
                //     res.add("Push");
                //     //stk.pop();
                //     index--;
                //     res.add("Pop");
                // }

                // if(i==target[target.length-1]) break;


                if(target[index]==i){
                    res.add("Push");
                    index++;
                }else{
                    res.add("Push");
                    res.add("Pop");
                }
            }

            return res;
        }

    public static void main(String[] args) {
        BuildArrayWithStack ob = new BuildArrayWithStack();
        System.out.println(ob.buildArray(new int []{1,2}, 4));
    }
}
