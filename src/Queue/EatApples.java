package Queue;

import java.util.PriorityQueue;

public class EatApples {

        public int eatenApples(int[] apples, int[] days) {
            PriorityQueue<int[]> pq = new PriorityQueue<>(
                    (a, b) -> a[0] - b[0]  // sort by expiry
            );

            int day = 0, eaten = 0;
            int n = apples.length;

            while (day < n || !pq.isEmpty()) {

                // Add new apples for today
                if (day < n && apples[day] > 0) {
                    pq.offer(new int[]{day + days[day], apples[day]});
                }

                // Remove rotten apples
                while (!pq.isEmpty() && pq.peek()[0] <= day) {
                    pq.poll();
                }

                // Eat one apple
                if (!pq.isEmpty()) {
                    int[] top = pq.poll();
                    top[1]--;
                    eaten++;
                    if (top[1] > 0) pq.offer(top);
                }

                day++;
            }
            return eaten;
        }

    public static void main(String[] args) {
        EatApples ob = new EatApples();
        int [] apples = {1,2,3,5,2};
        int [] day = {3,2,1,4,2};
        System.out.println(ob.eatenApples(apples,day));
    }
}
