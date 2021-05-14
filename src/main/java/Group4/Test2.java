package Group4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        String pattern = "abba", str = "dog cat cat dog";
        Test2 test2 = new Test2();
        boolean b = test2.wordPattern(pattern, str);
        System.out.println(b);
    }

    public boolean wordPattern(String pattern, String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        Map<String, List<Integer>> map1 = new HashMap<>();
        String[] s1 = s.split(" ");
        if (s1.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.get(c) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(c, list);
            } else {
                List<Integer> list = map.get(c);
                list.add(i);
                map.put(c, list);
            }
        }
        for (int i = 0; i < s1.length; i++) {
            String s2 = s1[i];
            if (map1.get(s2) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map1.put(s2, list);
            } else {
                List<Integer> list = map1.get(s2);
                list.add(i);
                map1.put(s2, list);
            }
        }
        for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
            List<Integer> value = entry.getValue();
            Integer integer = value.get(0);
            List<Integer> list = map1.get(s1[integer]);
            if (!list.equals(value)) {
                return false;
            }
        }
        return true;
    }
}
