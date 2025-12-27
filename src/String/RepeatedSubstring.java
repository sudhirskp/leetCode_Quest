package String;

public class RepeatedSubstring {

    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        String trim = str.substring(1,str.length()-1);
        //System.out.print(trim);
        return trim.contains(s);

    }
    public static void main(String[] args) {
        RepeatedSubstring ob = new RepeatedSubstring();
        System.out.println(ob.repeatedSubstringPattern("abab"));
    }
}
