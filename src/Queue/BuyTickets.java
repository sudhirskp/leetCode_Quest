package Queue;

public class BuyTickets {


        public int timeRequiredToBuy(int[] tickets, int k) {
            int n = tickets.length;
            int res = 0;
            int tk = tickets[k];

            for(int i=0;i<n;i++){
                if(i<=k)
                    res += Math.min(tickets[i],tk);
                else
                    res += Math.min(tickets[i],tk-1);

            }
            return res;
        }

    public static void main(String[] args) {
        BuyTickets ob = new BuyTickets();
        System.out.println(ob.timeRequiredToBuy(new int []{2,3,2},2));
    }
}
