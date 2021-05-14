package Group3;

import java.util.ArrayDeque;
import java.util.Queue;

//222. 完全二叉树的节点个数
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Test2 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        Test2 test2 = new Test2();
        int i = test2.countNodes(treeNode1);
        System.out.println(i);
    }

    public int countNodes(TreeNode root) {
        int res = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            res += size;
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode.left != null) queue.add(treeNode.left);
                if (treeNode.right != null) queue.add(treeNode.right);
            }
        }
        return res;
    }
}
