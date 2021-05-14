package Group4;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String s = "aadadaad";
        Test test = new Test();
        int i = test.firstUniqChar(s);
        System.out.println(i);
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer[]> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer[] values = map.get(s.charAt(i));
            if (values != null) {
                Integer[] res = new Integer[2];
                res[0] = values[0];
                res[1] = values[1] + 1;
                map.put(s.charAt(i), res);
            } else {
                map.put(s.charAt(i), new Integer[]{i, 1});
            }
        }
        int min = s.length();
        for (Map.Entry<Character, Integer[]> entry : map.entrySet()) {
            Integer[] value = entry.getValue();
            if (value[1] == 1) {
                min = Math.min(min, value[0]);
            }
        }
        return min == s.length() ? -1 : min;
    }
}
