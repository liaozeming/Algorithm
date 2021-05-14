package Group14;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月06日 10:43
 */

public class Test4 {
    public void setZeroes(int[][] matrix)
    {
        matrix[0][0]=2;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        Test4 test4=new Test4();
        test4.setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}