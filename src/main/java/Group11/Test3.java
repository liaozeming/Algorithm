package Group11;

public class Test3 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        Test3 test3 = new Test3();
        boolean toeplitzMatrix = test3.isToeplitzMatrix(matrix);
        System.out.println(toeplitzMatrix);
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        int[] row = matrix[0];
        int[] col = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            col[i] = matrix[i][0];
        }
        //第一行的对角线
        for (int i = 0; i < row.length; i++) {
            int temp = row[i];
            //行数
            int left = 0;
            //列数
            int right = i;
            while (left < col.length && right < row.length) {
                if (temp == matrix[left][right]) {
                    left++;
                    right++;
                } else {
                    return false;
                }
            }
        }
        //第一列的对角线
        for (int i = 0; i < col.length; i++) {
            int temp = col[i];
            int left = 0;
            int right = i;
            while (left < row.length && right < col.length) {
                if (temp == matrix[right][left]) {
                    left++;
                    right++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
