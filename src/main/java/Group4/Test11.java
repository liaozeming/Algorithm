package Group4;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Test11 {
    public static void main(String[] args) {
        Test11 test11 = new Test11();
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        head.next = head1;
        head1.next = head2;
        ListNode listNode = test11.ReverseList(head);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode ReverseList(ListNode head) {
        ListNode cur = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = cur;
            cur = head;
            head = temp;
        }
        return cur;
    }
}
