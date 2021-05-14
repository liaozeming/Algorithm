package Group7;

import Group4.Test;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        String s = "99", t = "99";
        Test6 test6 = new Test6();
        String solve = test6.solve(s, t);
        System.out.println(solve);
    }


    public String solve(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        int[] nums1 = new int[len1];
        int[] nums2 = new int[len2];

        for (int i = 0; i < len1; i++) {
            nums1[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < len2; i++) {
            nums2[i] = t.charAt(i) - '0';
        }

        int[] result = new int[len1 + len2];

        // 1. 逐位相乘
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                result[i + j] += nums1[i] * nums2[j];
            }
        }

        // 2. 从后往前进位
        for (int k = result.length - 1; k > 0; k--) {
            result[k - 1] += result[k] / 10;
            result[k] = result[k] % 10;
        }

        // 输出字符串
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < result.length - 1; i++) {
            stringBuilder.append(result[i]);
        }
        return stringBuilder.toString();
    }

}
