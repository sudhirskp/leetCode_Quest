package Prefix_Sum;


import LinkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Next_Largest {

    public int[] nextLargerNodes(ListNode head) {
        ListNode pre = head;
        ListNode temp = head.next;
        List<Integer> list = new ArrayList<>();

        while(temp!=null){
            if(pre.val<temp.val){
                list.add(temp.val);
                pre = pre.next;
                temp = pre.next;
            }else{
                if(temp.next==null){
                    list.add(0);
                    pre = pre.next;
                    temp = pre.next;
                }else
                    temp = temp.next;
            }
        }
        list.add(0);
        //System.out.print(list);
        int [] ans = new int [list.size()];
        int i =0;
        for(int v: list){
            ans[i++] = v;
        }
        return ans;
    }

    public static void main(String[] args) {
        Next_Largest ob = new Next_Largest();
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        int[] res = ob.nextLargerNodes(n1);
        System.out.println(java.util.Arrays.toString(res));
    }
}
