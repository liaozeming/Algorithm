package Group7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        int[][] s = {{2, 1}, {1, 1}, {1, 2}, {2, 2}};
        Arrays.sort(s, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return 01 - 02;
            }
        });
        for (int i = 0; i < s.length; i++) {
            System.out.println(Arrays.toString(s[i]));
        }
    }
}
