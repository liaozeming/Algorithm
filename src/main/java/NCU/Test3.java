package NCU;

//搜索第k个小的关键码节点
public class Test3 {
    public static void main(String[] args) {
        BinaryNode1 binaryNode1 = new BinaryNode1(3, 2);
        BinaryNode1 binaryNode2 = new BinaryNode1(2, 1);
        BinaryNode1 binaryNode3 = new BinaryNode1(4, 1);
        binaryNode1.left = binaryNode2;
        binaryNode1.right = binaryNode3;
        Test3 test3 = new Test3();
        BinaryNode1 findk = test3.findk(4, binaryNode1);
        System.out.println(findk.data);
    }

    public BinaryNode1 findk(int k, BinaryNode1 binaryNode1) {
        if (binaryNode1.Lsize == k) {
            return binaryNode1;
        }
        if (k < binaryNode1.Lsize) return findk(k, binaryNode1.left);
        if (binaryNode1.right == null) return null;
        return findk(k - binaryNode1.Lsize, binaryNode1.right);
    }
}
