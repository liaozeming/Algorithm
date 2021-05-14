package Group7;


import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int n = 6, m = 2;
        int[] a = {1, 2, 3, 4, 5, 6};
        Test5 test5 = new Test5();
        int[] solve = test5.solve(n, m, a);
        System.out.println(Arrays.toString(solve));
    }

    public int[] solve(int n, int m, int[] a) {
        // write code here
        int size = m;
        while (size > 0) {
            int temp = a[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                a[i + 1] = a[i];
            }
            a[0] = temp;
            size--;
        }
        return a;
    }
}
