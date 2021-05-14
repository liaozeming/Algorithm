package Group11;

import java.util.HashMap;

public class Test7 {
    public static void main(String[] args) {
        String s = "ababbc";
        int k = 2;
        Test7 test7 = new Test7();
        int i = test7.longestSubstring(s, k);
        System.out.println(i);
    }

    // 求一个最长的子字符串的长度，该子字符串中每个字符出现的次数都最少为 kk
    public int longestSubstring(String s, int k) {
        //如果字符串s的长度少于 k，那么一定不存在满足题意的子字符串，返回 0；
        if (s.length() < k) return 0;
        HashMap<Character, Integer> counter = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char c : counter.keySet()) {
            //：如果一个字符 c 在 s 中出现的次数少于 kk 次，
            // 那么 s 中所有的包含 c 的子字符串都不能满足题意。
            // 所以，应该在 s 的所有不包含 c 的子字符串中继续寻找结果
            if (counter.get(c) < k) {
                int res = 0;
                for (String t : s.split(String.valueOf(c))) {
                    res = Math.max(res, longestSubstring(t, k));
                }
                return res;
            }
        }
        // 未进入递归时的返回结果：如果 s 中的每个字符出现的次数都大于k 次，
        // 那么 s 就是我们要求的字符串，直接返回该字符串的长度。
        return s.length();
    }
}
