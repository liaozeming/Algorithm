package Group12;

import Group11.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        int n = 3;
        Test5 test5 = new Test5();
        int[][] ints = test5.generateMatrix(n);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
        System.out.println('b' - 'a');
    }

    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while (num <= tar) {
            for (int i = l; i <= r; i++) mat[t][i] = num++; // left to right.
            t++;
            for (int i = t; i <= b; i++) mat[i][r] = num++; // top to bottom.
            r--;
            for (int i = r; i >= l; i--) mat[b][i] = num++; // right to left.
            b--;
            for (int i = b; i >= t; i--) mat[i][l] = num++; // bottom to top.
            l++;
        }
        return mat;
    }


}
