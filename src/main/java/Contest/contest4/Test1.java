package Contest.contest4;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        String s = "YazaAay";
        Test1 test1 = new Test1();
        String s1 = test1.longestNiceSubstring(s);
        System.out.println(s1);
    }

    public String longestNiceSubstring(String s) {
        String res = "";
        char[] chars = s.toCharArray();
        Map<Integer, Integer> map = new HashMap<>();
        //最长长度
        int max = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = chars.length; j > i + 1; j--) {
                //尾部j不包含
                String substring = s.substring(i, j);
                if (perfect(substring)) {
                    max = Math.max(max, j - i);
                    map.put(i, j - 1);
                    //如果i-j满足完美字符串，则根据条件对于i为起点的后续递减字符不需要判断
                    break;
                }
            }
        }
        int minLeft = s.length() + 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() - entry.getKey() + 1 == max) {
                minLeft = Math.min(minLeft, entry.getKey());
            }
        }

        return map.size() == 0 ? res : s.substring(minLeft, minLeft + max);
    }

    private boolean perfect(String substring) {
        char[] chars = substring.toLowerCase().toCharArray();
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            characters.add(chars[i]);
        }
        Iterator<Character> iterator = characters.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next().toString().toUpperCase();
            if (!substring.contains(s) || !substring.contains(s.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
