package Contest.contest2;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int a = 2, b = 4, c = 6;
        Test2 test2 = new Test2();
        int i = test2.maximumScore(a, b, c);
        System.out.println(i);
    }

    public int maximumScore(int a, int b, int c) {
        int[] A = new int[3];
        A[0] = a;
        A[1] = b;
        A[2] = c;
        int res = 0;
        while (true) {
            Arrays.sort(A);
            if (A[1] == 0) {
                break;
            }
            if (A[0] > 0) {
                A[0] = A[0] - 1;
                A[2] -= 1;
            } else {
                A[1] -= 1;
                A[2] -= 1;
            }
            res++;
        }
        return res;
    }
}
