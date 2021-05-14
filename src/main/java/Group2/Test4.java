package Group2;

import java.util.Arrays;

//922. 按奇偶排序数组 II
public class Test4 {
    public static void main(String[] args) {
        int[] A = {4, 2, 5, 7};
        Test4 test4 = new Test4();
        int[] ints = test4.sortArrayByParityII(A);
        System.out.println(Arrays.toString(ints));
    }

    public int[] sortArrayByParityII(int[] A) {
        int n = A.length;
        int j = 1;
        for (int i = 0; i < n; i += 2) {
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1) {
                    j += 2;
                }
                swap(A, i, j);
            }
        }
        return A;
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
