package Contest.contest6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        String s = "(name)is(age)yearsold";
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("name");
        list.add("bob");
        list1.add("age");
        list1.add("two");
        List<List<String>> knowledge = new ArrayList<>();
        knowledge.add(list);
        knowledge.add(list1);
        Test3 test3 = new Test3();
        String evaluate = test3.evaluate(s, knowledge);
        System.out.println(evaluate);
    }

    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < knowledge.size(); i++) {
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int left = 0;
        int right = 0;
        while (right < chars.length) {
            while (right < chars.length && chars[right] != '(') {
                stringBuilder.append(chars[right]);
                left++;
                right++;
            }
            if (right == chars.length) {
                return stringBuilder.toString();
            }
            //替换的字符串
            StringBuilder temp = new StringBuilder();
            while (right < chars.length && chars[right] != ')') {
                temp.append(chars[right]);
                right++;
            }
            String s1 = temp.toString().substring(1, temp.length());
            if (map.get(s1) != null) {
                stringBuilder.append(map.get(s1));
            } else {
                stringBuilder.append("?");
            }
            right++;
            left = right;
        }
        return stringBuilder.toString();

    }
}
