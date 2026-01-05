package Stack;

import java.util.Stack;

public class ReversedPolish {


        public int evalRPN(String[] tokens) {
            Stack<Integer> st = new Stack<>();

            for (String token : tokens) {
                if (token.equals("+")) {
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a + b);
                } else if (token.equals("-")) {
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a - b);
                } else if (token.equals("*")) {
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a * b);
                } else if (token.equals("/")) {
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a / b);
                } else {
                    st.push(Integer.parseInt(token));
                }
            }
            return st.pop();
        }

    public static void main(String[] args) {
        ReversedPolish ob = new ReversedPolish();
        System.out.println(ob.evalRPN(new String []{"2","1","+","3","*"}));
    }
}
