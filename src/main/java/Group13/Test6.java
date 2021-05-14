package Group13;


import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Test6 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(6);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        Test6 test6 = new Test6();
        int i = test6.minDiffInBST(treeNode1);
        System.out.println(i);
    }

    //层次遍历
    /*public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() != 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                list.add(t.val);
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
        }

        Integer[] array = list.toArray(new Integer[list.size()]);
        Arrays.sort(array);
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < array.length-1; i++) {
            min=Math.min(min,array[i+1]-array[i]);
        }
        return min;
    }*/
    private TreeNode pre = null;   //pre记录前一节点
    private int res = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return res;
    }
    //中序遍历
    private void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        if(pre != null){
            res = Math.min(root.val-pre.val,res);   //记录最小
        }
        pre = root;
        dfs(root.right);
    }

}

