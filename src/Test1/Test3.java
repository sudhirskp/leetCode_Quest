package Test1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test3 {

    private String RemoveDuplicateLetters(String str){
        int n = str.length();
        int [] count = new int [26];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i) - 'a']++;
        }

        boolean [] visited = new boolean [26];
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            count[ch - 'a']--;
            if(visited[ch - 'a']) continue;
            while(!deque.isEmpty() && deque.peekLast() > ch && count[deque.peekLast() - 'a'] > 0){
                visited[deque.pollLast()-'a'] = false;
            }

            deque.add(ch);
            visited[ch-'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        while(!deque.isEmpty()){
            sb.append(deque.pollFirst());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Test3 ob = new Test3();
        System.out.println(ob.RemoveDuplicateLetters("bcabc"));
    }
}
