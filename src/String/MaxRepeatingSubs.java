package String;

public class MaxRepeatingSubs {


        public int maxRepeating(String sequence, String word) {
           String cur = word;
           int count =0;
           while(cur.length()<sequence.length()){
               if(sequence.contains(cur)){
                   count++;
               }
               cur += word;
           }


            return count;
        }

    public static void main(String[] args) {
            MaxRepeatingSubs ob = new MaxRepeatingSubs();
        System.out.println(ob.maxRepeating("ababa","ab"));
        System.out.println(ob.maxRepeating("abab","ba"));
        System.out.println(ob.maxRepeating("ababc","ac"));
    }
}

//Example 1:
//
//Input: sequence = "ababc", word = "ab"
//Output: 2
//Explanation: "abab" is a substring in "ababc".
//Example 2:
//
//Input: sequence = "ababc", word = "ba"
//Output: 1
//Explanation: "ba" is a substring in "ababc". "baba" is not a substring in "ababc".
//Example 3:
//
//Input: sequence = "ababc", word = "ac"
//Output: 0
//Explanation: "ac" is not a substring in "ababc".