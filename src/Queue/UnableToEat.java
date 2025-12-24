package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class UnableToEat {


        public int countStudents(int[] students, int[] sandwiches) {
            Deque<Integer> que = new ArrayDeque<>();
            int i =0;
            int rotate = 0;

            for(int st : students){
                que.offer(st);
            }

            while(!que.isEmpty() && rotate < que.size()){
                int st = que.peek();
                if(st==sandwiches[i]){
                    i++;
                    rotate = 0;
                    que.poll();
                }else{
                    que.offer(que.poll());
                    rotate++;
                }
            }
            return que.size();
        }

    public static void main(String[] args) {
        UnableToEat ob = new UnableToEat();
        System.out.println(ob.countStudents(new int []{1,1,0,0},new int []{0,1,0,1}));
    }
}
