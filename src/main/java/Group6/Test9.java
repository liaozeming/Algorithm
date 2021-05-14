package Group6;

import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Test9 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        Test9 test9 = new Test9();
        ListNode partition = test9.partition(listNode1, 3);
        while (partition != null) {
            System.out.println(partition.val);
            partition = partition.next;
        }
    }

    public ListNode partition(ListNode head, int x) {
        //小链表头
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
//        大链表头
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = after_head.next;

        return before_head.next;
    }
}
