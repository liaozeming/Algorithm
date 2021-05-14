package Group12;


public class Test6 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(3);
        head.next = next1;
        next1.next = next2;
        Test6 test6 = new Test6();
        test6.deleteDuplicates(head);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if (head.val == head.next.val) head = head.next;
        return head;
    }
}
