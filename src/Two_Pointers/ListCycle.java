package Two_Pointers;
import LinkedList.ListNode;


public class ListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode sec = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            sec = sec.next;
            if(sec==fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListCycle ob = new ListCycle();
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        System.out.println(ob.hasCycle(n1));
    }
}
