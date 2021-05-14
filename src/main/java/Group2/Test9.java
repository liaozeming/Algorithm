package Group2;

import java.util.HashMap;
import java.util.Map;

public class Test9 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        Test9 test9 = new Test9();
        boolean anagram = test9.isAnagram(s, t);
        System.out.println(anagram);
    }

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (map.get(t.charAt(i)) == null || map.get(t.charAt(i)) == 0) {
                return false;
            }
            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
