package Hash;

import java.util.HashMap;

public class DeepCopy_RandomPointer {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node curr = head;


        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }


        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }


        curr = head;
        Node newHead = head.next;
        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;
            copy.next = (copy.next != null) ? copy.next.next : null;
            curr = curr.next;
        }

        return newHead;
    }

    public Node copyRandomList1(Node head) {
        Node curr = head;
        HashMap<Node , Node> map = new HashMap<>();

        while(curr!=null){
            map.put(curr,new Node(curr.val));
            curr = curr.next;
        }


        curr = head;

        while(curr!=null){
            Node cpy = map.get(curr);
            cpy.next = map.get(curr.next);
            cpy.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }

    public static void main(String[] args) {
        DeepCopy_RandomPointer sol = new DeepCopy_RandomPointer();
        Node n1 = sol.new Node(1);
        Node n2 = sol.new Node(2);
        Node n3 = sol.new Node(3);
        n1.next = n2; n2.next = n3;
        n1.random = n3;
        n2.random = n1;
        n3.random = n3;

        Node copy = sol.copyRandomList1(n1);

        System.out.println("Original:");
        for (Node cur = n1; cur != null; cur = cur.next) {
            System.out.println("val=" + cur.val + " random=" + (cur.random != null ? cur.random.val : "null"));
        }

        System.out.println("Copy:");
        for (Node cur = copy; cur != null; cur = cur.next) {
            System.out.println("val=" + cur.val + " random=" + (cur.random != null ? cur.random.val : "null"));
        }
    }
}
