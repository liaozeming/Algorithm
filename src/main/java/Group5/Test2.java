package Group5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        int[][] ints = test2.threeOrders(treeNode1);
        System.out.println(Arrays.deepToString(ints));
    }

    public int[][] threeOrders(TreeNode root) {
        // write code here
//        前序
        List<Integer> before = preorderTraversal(root);
//        System.out.println(before);
        int[][] s = new int[3][before.size()];
        for (int i = 0; i < before.size(); i++) {
            s[0][i] = before.get(i);
        }
        //        中序
        List<Integer> inorderTraversal = inorderTraversal(root);
//        System.out.println(inorderTraversal);
        for (int i = 0; i < inorderTraversal.size(); i++) {
            s[1][i] = inorderTraversal.get(i);
        }

        //        后序
        List<Integer> postorderTraversal = postorderTraversal(root);
//        System.out.println(postorderTraversal);
        for (int i = 0; i < postorderTraversal.size(); i++) {
            s[2][i] = postorderTraversal.get(i);
        }
        return s;
    }

    List<Integer> res = new ArrayList<>();

    private List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return res;
        res.add(root.val);
        if (root.left != null) {
            preorderTraversal(root.left);
        }
        if (root.right != null) {
            preorderTraversal(root.right);
        }
        return res;
    }

    List<Integer> res1 = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return res1;
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        res1.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right);
        }
        return res1;
    }

    //后序
    List<Integer> res2 = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return res2;
        if (root.left != null) {
            postorderTraversal(root.left);
        }
        if (root.right != null) {
            postorderTraversal(root.right);
        }
        res2.add(root.val);
        return res2;
    }
}
