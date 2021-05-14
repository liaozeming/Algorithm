package Group3;

import java.util.HashMap;
import java.util.Map;

public class Test6 {
    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        Test6 test6 = new Test6();
        int i = test6.fourSumCount(A, B, C, D);
        System.out.println(i);
    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int temp = A[i] + B[j];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int reverse = -(C[i] + D[j]);
                if (map.containsKey(reverse)) {
                    res += map.get(reverse);
                }
            }
        }
        return res;
    }
}
