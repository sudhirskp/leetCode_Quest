package Heap;

import java.util.PriorityQueue;

public class TargetArrayWithMulSum {

        public boolean isPossible(int[] target) {
            long sum = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

            for (int x : target) {
                sum += x;
                pq.offer(x);
            }

            while (true) {
                int max = pq.poll();
                long rest = sum - max;

                if (max == 1 || rest == 1)
                    return true;

                if (rest == 0 || max <= rest)
                    return false;

                int prev = (int) (max % rest);
                if (prev == 0)
                    prev = (int) rest;

                pq.offer(prev);
                sum = rest + prev;
            }
        }

    public static void main(String[] args) {
        TargetArrayWithMulSum ob = new TargetArrayWithMulSum();
        System.out.println(ob.isPossible(new int []{9,3,5}));
    }
}
