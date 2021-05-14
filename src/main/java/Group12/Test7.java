package Group12;

public class Test7 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(3);
        ListNode next3 = new ListNode(4);
        ListNode next4 = new ListNode(5);
        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        next3.next = next4;
        Test7 test7 = new Test7();
        int k = 2;
        ListNode listNode = test7.rotateRight(head, k);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int[] res = new int[size];
        int t = 0;
        while (head != null) {
            res[(t + k) % size] = head.val;
            head = head.next;
            t++;
        }
        ListNode listNode = new ListNode(1);
        ListNode r = listNode;
        for (int i = 0; i < size; i++) {
            ListNode tempListNode = new ListNode(res[i]);
            listNode.next = tempListNode;
            listNode = tempListNode;
        }
        return r.next;
    }
}
