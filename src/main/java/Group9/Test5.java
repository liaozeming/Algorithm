package Group9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Test5 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode4;
        treeNode3.left = treeNode5;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            List<Integer> list = getPath(i, treeNode1);
            System.out.println(list.toString());
        }
    }

    private static List<Integer> getPath(int i, TreeNode treeNode1) {
        //暂存一段路径，以便递归
        List<Integer> list = new ArrayList<>();
        //从根节点到尾节点的全部路径
        List<List<Integer>> lists = new ArrayList<>();
        dfs(treeNode1, list, lists);
        //返回路径
        List<Integer> resList = new ArrayList<>();
        for (int j = 0; j < lists.size(); j++) {
            List<Integer> list1 = lists.get(j);
            if (list1.contains(i)) {
                int k = 0;
                resList.add(list1.get(k));
                while (list1.get(k) != i) {
                    k++;
                    resList.add(list1.get(k));
                }
            }
        }
        return resList;
    }

    private static void dfs(TreeNode treeNode1, List<Integer> list, List<List<Integer>> lists) {
        if (treeNode1.left == null && treeNode1.right == null) {
            list.add(treeNode1.val);
            lists.add(list);
            return;
        }
        list.add(treeNode1.val);

        if (treeNode1.left != null) {
            dfs(treeNode1.left, new ArrayList<>(list), lists);

        }
        if (treeNode1.right != null) {
            dfs(treeNode1.right, new ArrayList<>(list), lists);

        }
    }
}
