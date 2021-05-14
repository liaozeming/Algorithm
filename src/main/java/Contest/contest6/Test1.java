package Contest.contest6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        String word = "0a0";
        Test1 test1 = new Test1();
        int i = test1.numDifferentIntegers(word);
        System.out.println(i);
    }

    public int numDifferentIntegers(String word) {
        char[] chars = word.toCharArray();
        int left = 0;
        int right = 0;
        Set<String> set = new HashSet<>();
        while (right < chars.length) {
            while (right < chars.length && !Character.isDigit(chars[right])) {
                right++;
            }
            left = right;
            StringBuilder stringBuilder = new StringBuilder();
            while (right < chars.length && Character.isDigit(chars[right])) {
                if (chars[right] == '0' && left == right) {
                    left++;
                    right++;
                    continue;
                }
                stringBuilder.append(chars[right]);
                right++;
            }
            if (left == right && chars[right - 1] == '0') {
                set.add("0");
            }
            if (stringBuilder.toString().length() != 0) {
                set.add(stringBuilder.toString());
            }
        }
        return set.size();
    }
}
