package String;

public class RepeatedStringMatch {


        public int repeatedStringMatch1(String a, String b) {
            int minRepeats = (int) Math.ceil((double) b.length() / a.length());

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < minRepeats; i++) {
                sb.append(a);
            }

            if (sb.toString().contains(b)) return minRepeats;

            sb.append(a); // one more repeat for overlap
            if (sb.toString().contains(b)) return minRepeats + 1;

            return -1;
        }


        public int repeatedStringMatch(String a, String b) {
            int n = a.length();
            int count =0;
            String str = "";
            while(b.length()>str.length()){
                str += a;
                count++;
            }

            if(str.contains(b)) return count;

            str+=a;
            count++;

            if(str.contains(b)) return count;
            return -1;
        }


    public static void main(String[] args) {
            RepeatedStringMatch ob = new RepeatedStringMatch();
            System.out.println(ob.repeatedStringMatch1("abcd","cdabcdab"));
    }
}
