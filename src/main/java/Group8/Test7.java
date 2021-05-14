package Group8;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        String s = "abcd", t = "bcdf";
        int cost = 3;
        Test7 test7 = new Test7();
        int i = test7.equalSubstring(s, t, cost);
        System.out.println(i);
    }

    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int right = 0;
        int cost = 0;
        int res = 0;
        while (right < s.length()) {
            cost += Math.abs(s.charAt(right) - t.charAt(right));
            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
