package LinkedList;

public class OddEvenLIst {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public ListNode oddEvenList(ListNode head) {
            if(head==null) return head;
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evh = even;

            while(even!=null && even.next!=null){
                odd.next = even.next;
                odd = odd.next;

                even.next = odd.next;
                even = even.next;
            }

            odd.next = evh;
            return head;
        }


    // Helper method to create a linked list from an array
    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        OddEvenLIst solution = new OddEvenLIst();

        // Test case 1: [1,2,3,4,5]
        System.out.println("Test case 1:");
        int[] arr1 = {1, 2, 3, 4, 5};
        ListNode head1 = createList(arr1);
        System.out.print("Input:  ");
        printList(head1);
        ListNode result1 = solution.oddEvenList(head1);
        System.out.print("Output: ");
        printList(result1);
        System.out.println("Expected: 1 -> 3 -> 5 -> 2 -> 4");
        System.out.println();

        // Test case 2: [2,1,3,5,6,4,7]
        System.out.println("Test case 2:");
        int[] arr2 = {2, 1, 3, 5, 6, 4, 7};
        ListNode head2 = createList(arr2);
        System.out.print("Input:  ");
        printList(head2);
        ListNode result2 = solution.oddEvenList(head2);
        System.out.print("Output: ");
        printList(result2);
        System.out.println("Expected: 2 -> 3 -> 6 -> 7 -> 1 -> 5 -> 4");
        System.out.println();

        // Test case 3: Single element [1]
        System.out.println("Test case 3:");
        int[] arr3 = {1};
        ListNode head3 = createList(arr3);
        System.out.print("Input:  ");
        printList(head3);
        ListNode result3 = solution.oddEvenList(head3);
        System.out.print("Output: ");
        printList(result3);
        System.out.println("Expected: 1");
        System.out.println();

        // Test case 4: Two elements [1,2]
        System.out.println("Test case 4:");
        int[] arr4 = {1, 2};
        ListNode head4 = createList(arr4);
        System.out.print("Input:  ");
        printList(head4);
        ListNode result4 = solution.oddEvenList(head4);
        System.out.print("Output: ");
        printList(result4);
        System.out.println("Expected: 1 -> 2");
        System.out.println();

        // Test case 5: Empty list
        System.out.println("Test case 5:");
        ListNode head5 = null;
        System.out.print("Input:  null");
        System.out.println();
        ListNode result5 = solution.oddEvenList(head5);
        System.out.print("Output: ");
        printList(result5);
        System.out.println("Expected: null");
    }
}
