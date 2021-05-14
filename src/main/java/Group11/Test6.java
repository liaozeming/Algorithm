package Group11;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        Test6 test6 = new Test6();
        int[][] transpose = test6.transpose(matrix);
        for (int i = 0; i < transpose.length; i++) {
            System.out.println(Arrays.toString(transpose[i]));
        }
    }

    public int[][] transpose(int[][] matrix) {
        int length = matrix.length;
        int length1 = matrix[0].length;
        int[][] res = new int[length1][length];
        for (int i = 0; i < length1; i++) {
            int[] temp = new int[length];
            for (int j = 0; j < length; j++) {
                temp[j] = matrix[j][i];
            }
            res[i] = temp;
        }
        return res;
    }
}
