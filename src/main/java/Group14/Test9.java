package Group14;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月10日 4:26
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {};
    TreeNode(int val) { this.val = val; }
  }
public class Test9 {
    public static void main(String[] args) {
        TreeNode root1=new TreeNode(1);
        TreeNode treeNode1=new TreeNode(2);
        TreeNode treeNode2=new TreeNode(3);
        root1.left=treeNode1;
        root1.right=treeNode2;
        TreeNode root2=new TreeNode(1);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(2);
        root2.left=treeNode3;
        root2.right=treeNode4;
        Test9 test9=new Test9();
        boolean b = test9.leafSimilar(root1, root2);
        System.out.println(b);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        list1=dfs(root1,list1);
        list2=dfs(root2,list2);

        return list1.equals(list2);
    }

    private List<Integer> dfs(TreeNode root, List<Integer> list) {
        if (root.left==null && root.right==null)
        {
            list.add(root.val);
        }else {
            if (root.left!=null)
            {
                dfs(root.left,list);
            }
            if (root.right!=null)
            {
                dfs(root.right,list);
            }
        }
        return list;
    }


}