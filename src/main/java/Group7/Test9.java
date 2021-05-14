package Group7;

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        int a = (int) Math.pow(10, 6);
        int[] res = new int[a];
        int[] s = findTop(res);
        System.out.println(Arrays.toString(s));
    }

    private static int[] findTop(int[] res) {
        int[] s = new int[100];
        Arrays.sort(res);
        for (int i = 0; i < 100; i++) {
            s[i] = res[i];
        }
        return s;
    }
}
