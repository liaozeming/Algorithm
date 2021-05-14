package Group4;

import Group3.Test2;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Test6 {
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
        Test6 test6 = new Test6();
        List<List<Integer>> lists = test6.zigzagLevelOrder(treeNode1);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).toString());
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return res;
        queue.add(root);
        int temp = queue.size();
        //广度遍历
        while (queue.size() != 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < temp; i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if (poll.left != null)
                    queue.add(poll.left);
                if (poll.right != null)
                    queue.add(poll.right);
            }
            temp = queue.size();
            res.add(list);
        }
        //翻转
        for (int i = 0; i < res.size(); i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                List<Integer> list = res.get(i);
                int left = 0;
                int right = list.size() - 1;
                while (left < right) {
                    int temp1 = list.get(left);
                    list.set(left, list.get(right));
                    list.set(right, temp1);
                    left++;
                    right--;
                }
                res.set(i, list);
            }
        }
        return res;
    }
}
