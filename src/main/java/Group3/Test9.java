package Group3;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Test9 test9 = new Test9();
        List<List<Integer>> permute = test9.permute(nums);
        for (int i = 0; i < permute.size(); i++) {
            System.out.println(permute.get(i).toString());
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        //判断是否使用过
        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();
        dfs(nums, len, 0, path, used, res);
        return res;
    }

    private static void dfs(int[] nums, int len, int depth, List<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (depth == len) {
            res.add(path);
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, len, depth + 1, path, used, res);
                used[i] = false;
                path.remove(depth);
            }
        }
    }
}
