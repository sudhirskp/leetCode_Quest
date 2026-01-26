package Prefix_Sum;

public class FindAltitude {

    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int [] alt = new int [n+1];
        int maxGain = 0;

        for(int i=1;i<=n;i++){
            alt[i] = alt[i-1] + gain[i-1];
            maxGain = Math.max(maxGain,alt[i]);
        }
        return maxGain;
    }

    public static void main(String[] args) {
        FindAltitude obj = new FindAltitude();
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(obj.largestAltitude(gain));
    }
}
