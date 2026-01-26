package LinkedList;

public class RemoveFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        //HashSet<Integer> list = new HashSet<>();
        ListNode pre = head;
        ListNode temp = head;
        int preval = -1;
        while(temp!=null){
            if(preval==temp.val){
                //ListNode temp = head;
                pre.next = temp.next;
            }else{
                preval = temp.val;
                pre = temp;
            }
            temp = temp.next;

        }
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
        RemoveFromSortedList ob = new RemoveFromSortedList();

        // Test case 1: [1,1,2]
        System.out.println("Test case 1:");
        int[] arr1 = {1, 1, 2};
        ListNode head1 = createList(arr1);
        System.out.print("Input:  ");
        printList(head1);
        ListNode result1 = ob.deleteDuplicates(head1);
        System.out.print("Output: ");
        printList(result1);
        System.out.println("Expected: 1 -> 2");
        System.out.println();

        // Test case 2: [1,1,2,3,3]
        System.out.println("Test case 2:");
        int[] arr2 = {1, 1, 2, 3, 3};
        ListNode head2 = createList(arr2);
        System.out.print("Input:  ");
        printList(head2);
        ListNode result2 = ob.deleteDuplicates(head2);
        System.out.print("Output: ");
        printList(result2);
        System.out.println("Expected: 1 -> 2 -> 3");
        System.out.println();

        // Test case 3: [1,1,1]
        System.out.println("Test case 3:");
        int[] arr3 = {1, 1, 1};
        ListNode head3 = createList(arr3);
        System.out.print("Input:  ");
        printList(head3);
        ListNode result3 = ob.deleteDuplicates(head3);
        System.out.print("Output: ");
        printList(result3);
        System.out.println("Expected: 1");
        System.out.println();

        // Test case 4: [1,2,3,4,5] - no duplicates
        System.out.println("Test case 4:");
        int[] arr4 = {1, 2, 3, 4, 5};
        ListNode head4 = createList(arr4);
        System.out.print("Input:  ");
        printList(head4);
        ListNode result4 = ob.deleteDuplicates(head4);
        System.out.print("Output: ");
        printList(result4);
        System.out.println("Expected: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println();

        // Test case 5: Single element [1]
        System.out.println("Test case 5:");
        int[] arr5 = {1};
        ListNode head5 = createList(arr5);
        System.out.print("Input:  ");
        printList(head5);
        ListNode result5 = ob.deleteDuplicates(head5);
        System.out.print("Output: ");
        printList(result5);
        System.out.println("Expected: 1");
    }
}
