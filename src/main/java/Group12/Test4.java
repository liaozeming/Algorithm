package Group12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Test4 test4 = new Test4();
        List<Integer> list = test4.spiralOrder(matrix);
        System.out.println(list);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        //圈数
        int m = matrix.length;
        int n = matrix[0].length;
        int circle = (Math.min(m, n) + 1) / 2;
        int i = 0;
        //统计矩阵从外向内的层数，如果矩阵非空，那么它的层数至少为1层
        int count = (Math.min(m, n) + 1) / 2;
        //从外部向内部遍历，逐层打印数据
        while (i < count) {
            for (int j = i; j < n - i; j++) {
                list.add(matrix[i][j]);
            }
            for (int j = i + 1; j < m - i; j++) {
                list.add(matrix[j][(n - 1) - i]);
            }

            for (int j = (n - 1) - (i + 1); j >= i && (m - 1 - i != i); j--) {
                list.add(matrix[(m - 1) - i][j]);
            }
            for (int j = (m - 1) - (i + 1); j >= i + 1 && (n - 1 - i) != i; j--) {
                list.add(matrix[j][i]);
            }
            i++;
        }

        return list;
    }
}
