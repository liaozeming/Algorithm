package Group3;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test7 {
    public static void main(String[] args) {
        int[] A = {3, 2, 3, 4};
        Test7 test7 = new Test7();
        int i = test7.largestPerimeter(A);
        System.out.println(i);
    }

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            int a = A[i];
            int b = A[i - 1];
            int c = A[i - 2];
            if (a < b + c) {
                return a + b + c;
            }
        }
        return 0;

    }
}
