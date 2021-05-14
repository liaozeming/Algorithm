package NCU;

import Group3.Test8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Test4 {
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
        Test4 test4 = new Test4();
        List<Integer> integers = test4.postorderTraversal(binaryNode1);
        System.out.println(integers.toString());
    }

    List<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal(BinaryNode root) {
       /* if(root==null) return res;
        if (root.left!=null)
        {
            postorderTraversal(root.left);
        }
        if (root.right!=null)
        {
            postorderTraversal(root.right);
        }
        res.add(root.data);
        return res;*/
        LinkedList<Integer> result = new LinkedList<>();
        Stack<BinaryNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                result.addFirst(root.data);
                root = root.right;
            } else {
                root = stack.pop();
                root = root.left;
            }
        }

        return result;
    }
}
