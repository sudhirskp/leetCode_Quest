package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStone {


        public int lastStoneWeight(int[] stones) {
            int n = stones.length;
            PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

            for(int st : stones){
                que.offer(st);
            }

            while(!que.isEmpty() && que.size()>1){

                int st1 = que.poll();
                int st2 = que.poll();

                if(st1==st2) continue;
                if(st1>st2){
                    que.offer(st1-st2);
                }
            }

            return que.size()==1 ? que.poll() : 0;
        }

    public static void main(String[] args) {
        LastStone ob = new LastStone();
        System.out.println(ob.lastStoneWeight(new int []{2,7,4,1,8,1}));
    }
}
