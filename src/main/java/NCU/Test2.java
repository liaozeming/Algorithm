package NCU;

public class Test2 {
    public static void main(String[] args) {
        BinaryNode binaryNode1 = new BinaryNode(5);
        BinaryNode binaryNode2 = new BinaryNode(3);
        BinaryNode binaryNode3 = new BinaryNode(7);
        BinaryNode binaryNode4 = new BinaryNode(2);
        BinaryNode binaryNode5 = new BinaryNode(4);
        BinaryNode binaryNode6 = new BinaryNode(6);
        BinaryNode binaryNode7 = new BinaryNode(8);
        binaryNode1.left = binaryNode2;
        binaryNode1.right = binaryNode3;
        binaryNode2.left = binaryNode4;
        binaryNode2.right = binaryNode5;
        binaryNode3.left = binaryNode6;
        binaryNode3.right = binaryNode7;
        Test2 test2 = new Test2();
        test2.BSTFind(binaryNode1, 3);

    }

    //输出所有不小于k的数据
    public void BSTFind(BinaryNode binaryNode, int k) {
        if (binaryNode != null) {
            BSTFind(binaryNode.right, k);
            if (binaryNode.data >= k) System.out.println(binaryNode.data);
            BSTFind(binaryNode.left, k);
        }
    }
}
