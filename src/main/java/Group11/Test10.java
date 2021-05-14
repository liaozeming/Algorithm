package Group11;

import java.util.Arrays;
import java.util.Comparator;

public class Test10 {
    public static void main(String[] args) {
        int[][] envelopes = {{2, 100}, {3, 200}, {4, 300}, {5, 500}, {5, 400}, {5, 250}, {6, 370}, {6, 360}, {7, 380}};
        Test10 test10 = new Test10();
        int i = test10.maxEnvelopes(envelopes);
        System.out.println(i);
    }

    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length == 0) {
            return 0;
        }

        int n = envelopes.length;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            public int compare(int[] e1, int[] e2) {
                //如果信封一维不等，按一维从低到高排序
                if (e1[0] != e2[0]) {
                    return e1[0] - e2[0];
                } else {
                    //信封一维相等，按二维从高到低排序
                    return e2[1] - e1[1];
                }
            }
        });
        //f[] 记录在他之前能包含多少个信封
        int[] f = new int[n];
        Arrays.fill(f, 1);
        int ans = 1;
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (envelopes[j][1] < envelopes[i][1]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
            ans = Math.max(ans, f[i]);
        }
        return ans;
    }
}
