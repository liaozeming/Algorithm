package Group7;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        Test7 test7 = new Test7();
        List<List<Integer>> lists = test7.allPathsSourceTarget(graph);
        System.out.println(lists);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        path.add(0);
        helper(0, path, res, graph);
        return res;
    }

    // 回溯算法求解
    private void helper(int index, List<Integer> path, List<List<Integer>> res, int[][] graph) {
        if (index > graph.length - 1) {
            return;
        }
        if (graph.length - 1 == index) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        int[] dresses = graph[index];
        for (int i = 0; i < dresses.length; i++) {
            path.add(dresses[i]);
            helper(dresses[i], path, res, graph);
            path.remove(path.size() - 1);
        }
    }
}
