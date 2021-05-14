package Group9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        Test10 test10 = new Test10();
        int[][] nums = {{1, 2}, {3, 4}};
        int r = 1, c = 4;
        int[][] ints = test10.matrixReshape(nums, r, c);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int all = r * c;
        int all1 = nums.length * nums[0].length;
        if (all != all1) {
            return nums;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                list.add(nums[i][j]);
            }
        }
        int[][] res = new int[r][c];
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = list.get(k);
                k++;
            }
        }
        return res;
    }
}
