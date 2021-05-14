package Group7;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd";
        Test4 test4 = new Test4();
        List<List<Integer>> lists = test4.largeGroupPositions(s);
        System.out.println(lists.toString());
    }

    public List<List<Integer>> largeGroupPositions(String s) {
        int temp = 0;
        List<List<Integer>> res = new ArrayList<>();
        while (temp < s.length()) {
            char c = s.charAt(temp);
            int min = temp;
            temp++;
            while (temp < s.length() && c == s.charAt(temp)) {
                temp++;
            }
            int max = temp - 1;
            if (max - min >= 2) {
                List<Integer> list = new ArrayList<>();
                list.add(min);
                list.add(max);
                res.add(list);
            }
        }
        return res;
    }
}
