package Group1;

import java.util.Arrays;

//905. 按奇偶排序数组
public class Test8 {
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4};
        Test8 test8 = new Test8();
        int[] ints = test8.sortArrayByParity(A);
        System.out.println(Arrays.toString(ints));
    }

    public int[] sortArrayByParity(int[] A) {
        int size = A.length;
        int[] res = new int[size];
        int left = 0, right = size - 1;
        for (int i = 0; i < size; i++) {
            if (A[i] % 2 == 0) {
                res[left] = A[i];
                left++;
            } else {
                res[right] = A[i];
                right--;
            }
        }
        return res;
    }
}
