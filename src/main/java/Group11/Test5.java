package Group11;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        Test5 test5 = new Test5();
        int[][] ints = test5.flipAndInvertImage(A);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(Arrays.toString(A[i]));
        }
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int[] ints = A[i];
            for (int j = 0; j < ints.length / 2; j++) {
                swap(j, ints.length - 1 - j, ints);
            }
            reverse(ints);
        }
        return A;
    }

    private void reverse(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 1) {
                ints[i] = 0;
            } else {
                ints[i] = 1;
            }
        }
    }


    private void swap(int j, int i, int[] ints) {
        int temp = ints[j];
        ints[j] = ints[i];
        ints[i] = temp;
    }
}
