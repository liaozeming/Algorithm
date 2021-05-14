package Group8;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] A = new int[5];
        A = new int[]{1, 3, 5};
        int m = 3;
        int[] B = {2, 4};
        int n = 2;
        Test2 test2 = new Test2();
        test2.merge(A, m, B, n);
        System.out.println(Arrays.toString(A));
    }

    public void merge(int A[], int m, int B[], int n) {
        //因为题目明确说了A数组足够大，所以直接在A数组操作
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;//AB合并后最后一个元素所在位置
        while (i >= 0 && j >= 0)//AB合并，谁大就先放谁
            A[index--] = A[i] > B[j] ? A[i--] : B[j--];
        while (j >= 0)//如果B没有遍历完，那么之间丢在A数组里面
            A[index--] = B[j--];
    }
}
