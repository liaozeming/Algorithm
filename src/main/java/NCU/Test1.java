package NCU;

//求出所有节点的data域平均值
public class Test1 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(3);
        listNode.link = listNode1;
        listNode1.link = listNode2;
        Test1 test1 = new Test1();
        float average = test1.getAverage(listNode, 3);
        System.out.println(average);
    }

    public float getAverage(ListNode head, int n) {
        if (n == 1)
            return head.data;
        else return (getAverage(head.link, n - 1) * (n - 1) + head.data) / n;
    }

}
