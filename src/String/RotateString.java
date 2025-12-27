package String;

public class RotateString {

    public boolean rotateString(String s, String goal) {
        int n = s.length();
        // while(n-->0){
        //     if(s.equals(goal)) return true;
        //     s = s.substring(1,s.length()) + s.charAt(0);
        // }
        if (s.length() != goal.length()) return false;
        String doubled = s + s;
        return doubled.contains(goal);

        //return false;
    }

    public static void main(String[] args) {
        RotateString ob = new RotateString();
        System.out.println(ob.rotateString("abcde", "cdeab"));
    }
}
