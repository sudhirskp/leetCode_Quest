package LinkedList;

import java.util.Stack;


public class ReverseList {

    public ListNode reverseList(ListNode head) {
        //ListNode temp = head;

        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            ListNode temp = head;
            stack.push(head);
            head = head.next;
        }

        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            node.next = null;
            temp.next = node;
            temp = temp.next;

        }
        return newNode.next;
    }

    public ListNode reverseList1(ListNode head) {
        ListNode current=head;
        ListNode rev = null;

        while(current != null){
            ListNode nextNode = current.next;
            current.next = rev;
            rev = current;
            current = nextNode;
        }

        return rev;
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
        ReverseList solution = new ReverseList();

        System.out.println("Testing reverseList (using Stack):");
        System.out.println("===================================");

        // Test case 1: [1,2,3,4,5]
        System.out.println("Test case 1:");
        int[] arr1 = {1, 2, 3, 4, 5};
        ListNode head1 = createList(arr1);
        System.out.print("Input:  ");
        printList(head1);
        ListNode result1 = solution.reverseList(createList(arr1)); // Recreate as original is modified
        System.out.print("Output: ");
        printList(result1);
        System.out.println("Expected: 5 -> 4 -> 3 -> 2 -> 1");
        System.out.println();

        // Test case 2: [1,2]
        System.out.println("Test case 2:");
        int[] arr2 = {1, 2};
        ListNode head2 = createList(arr2);
        System.out.print("Input:  ");
        printList(head2);
        ListNode result2 = solution.reverseList(createList(arr2));
        System.out.print("Output: ");
        printList(result2);
        System.out.println("Expected: 2 -> 1");
        System.out.println();

        // Test case 3: Empty list
        System.out.println("Test case 3:");
        System.out.print("Input:  null");
        System.out.println();
        ListNode result3 = solution.reverseList(null);
        System.out.print("Output: ");
        printList(result3);
        System.out.println("Expected: null");
        System.out.println();

        System.out.println("\nTesting reverseList1 (iterative approach):");
        System.out.println("===========================================");

        // Test case 4: [1,2,3,4,5]
        System.out.println("Test case 4:");
        int[] arr4 = {1, 2, 3, 4, 5};
        ListNode head4 = createList(arr4);
        System.out.print("Input:  ");
        printList(createList(arr4));
        ListNode result4 = solution.reverseList1(head4);
        System.out.print("Output: ");
        printList(result4);
        System.out.println("Expected: 5 -> 4 -> 3 -> 2 -> 1");
        System.out.println();

        // Test case 5: [1,2]
        System.out.println("Test case 5:");
        int[] arr5 = {1, 2};
        ListNode head5 = createList(arr5);
        System.out.print("Input:  ");
        printList(createList(arr5));
        ListNode result5 = solution.reverseList1(head5);
        System.out.print("Output: ");
        printList(result5);
        System.out.println("Expected: 2 -> 1");
        System.out.println();

        // Test case 6: Single element [1]
        System.out.println("Test case 6:");
        int[] arr6 = {1};
        ListNode head6 = createList(arr6);
        System.out.print("Input:  ");
        printList(createList(arr6));
        ListNode result6 = solution.reverseList1(head6);
        System.out.print("Output: ");
        printList(result6);
        System.out.println("Expected: 1");
    }
}
