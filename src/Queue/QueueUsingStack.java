package Queue;

import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {

        Stack<Integer> stk1;
        Stack<Integer> stk2;
        public QueueUsingStack() {
            stk1 = new Stack<>();
            stk2 = new Stack<>();
        }

        public void push(int x) {
            stk1.push(x);
        }

        public int pop() {
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
            int val = stk2.pop();

            while(!stk2.isEmpty()){
                stk1.push(stk2.pop());
            }
            return val;
        }

        public int peek() {
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }

            int val = stk2.peek();

            while(!stk2.isEmpty()){
                stk1.push(stk2.pop());
            }
            return val;
        }

        public boolean empty() {
            if(!stk1.isEmpty()) return false;
            return true;
        }

    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */

    public static void main(String[] args) {
        QueueUsingStack ob = new QueueUsingStack();
        ob.push(1);
        ob.push(2);
        System.out.println(ob.pop());
        System.out.println(ob.peek());
        System.out.println(ob.empty());
    }
}
