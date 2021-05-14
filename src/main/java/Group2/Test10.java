package Group2;

import java.util.Stack;

public class Test10 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Test10 test10 = new Test10();
        ListNode listNode = test10.reverseList(listNode1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode reverseList(ListNode head) {
       /* Stack<Integer> stack=new Stack<>();
        while (head!=null)
        {
            stack.push(head.val);
            head=head.next;
        }
        head=new ListNode(0);
        ListNode p=head;
        while (!stack.isEmpty())
        {
            ListNode listNode = new ListNode(stack.pop());
            head.next=listNode;
            head=head.next;
        }
        return p.next;*/

        ListNode cur = null;
        while (head != null) {
            ListNode t = head.next;
            head.next = cur;
            cur = head;
            head = t;
        }
        return cur;
    }
}
