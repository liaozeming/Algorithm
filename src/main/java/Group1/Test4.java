package Group1;
//637. 二叉树的层平均值

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Test4 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        Test4 test4 = new Test4();
        List<Double> doubles = test4.averageOfLevels(treeNode1);
        System.out.println(doubles.toString());
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.remove();
                temp.add(treeNode.val);
                if (treeNode.left != null) queue.add(treeNode.left);
                if (treeNode.right != null) queue.add(treeNode.right);
            }
            res.add(temp);
        }
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < res.size(); i++) {
            Double temp = Double.valueOf(0);
            for (int j = 0; j < res.get(i).size(); j++) {
                temp += res.get(i).get(j);
            }
            Double x = temp / res.get(i).size();
            list.add(x);
        }
        return list;
    }
}
