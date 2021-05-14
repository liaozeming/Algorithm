package Group2;

//147. 对链表进行插入排序
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Test8 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(-1);
        ListNode listNode2 = new ListNode(5);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(0);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Test8 test8 = new Test8();
        ListNode listNode = test8.insertionSortList(listNode1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode insertionSortList(ListNode head) {
        //哑节点 dummyHead 引入哑节点是为了便于在 head 节点之前插入节点。
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev, temp;
        // cur指针扫整个链表
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            // 符合递增，继续推进
            if (cur.val <= cur.next.val) {
                cur = cur.next;
            } else {
                //找到不符合递增的节点 cur.next小于前一个数
                // 保存给temp
                temp = cur.next;
                cur.next = cur.next.next;

                // 从dummy开始扫，用prev推进，找插入的位置
                prev = dummyHead;
                while (prev.next.val <= temp.val) {
                    prev = prev.next;
                }
                // 此时prev.Next.Val更大，插入到 prev 和 prev.Next 之间
                temp.next = prev.next;
                prev.next = temp;
            }
        }
        return dummyHead.next;
    }
}
