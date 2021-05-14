package Group;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Test5 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        root.Left = treeNode1;
        root.Right = treeNode2;
        treeNode1.Right = treeNode3;
        treeNode2.Left = treeNode4;
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        List<Integer> res = new ArrayList<>();
        backtrack(root, res, new Stack<>());
        System.out.println(res.toString());
    }

    private static void backtrack(TreeNode root, List<Integer> res, Stack<Integer> path) {

    }
}
