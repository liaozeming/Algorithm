package Contest.contest5;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String boxes = "001011";
        Test2 test2 = new Test2();
        int[] ints = test2.minOperations(boxes);
        System.out.println(Arrays.toString(ints));
    }

    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int t = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '0') {
                    continue;
                } else {
                    t += Math.abs(i - j);
                }
            }
            res[i] = t;
        }
        return res;
    }
}
