package Group9;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "adc", s2 = "dcda";
        Test1 test1 = new Test1();
        boolean b = test1.checkInclusion(s1, s2);
        System.out.println(b);
    }

    public boolean checkInclusion(String s1, String s2) {
        char[] chars = s1.toCharArray();
        String[] strings = GetSorts(chars);
        for (int i = 0; i < strings.length; i++) {
            if (s2.contains(strings[i])) {
                return true;
            }
        }
        return false;
    }

    //根据回溯法得到排列组合
    private String[] GetSorts(char[] chars) {
        int length = chars.length;
        List<String> res = new ArrayList<>();
        if (length == 0) return null;
        boolean[] used = new boolean[length];
        String s = "";
        dfs(chars, length, 0, s, used, res);
        String[] Sorts = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            Sorts[i] = res.get(i);
        }
        return Sorts;
    }

    private void dfs(char[] chars, int length, int depth, String s, boolean[] used, List<String> res) {
        if (depth == length) {
            res.add(new String(s));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (!used[i]) {
                s = s + chars[i];
                used[i] = true;
                dfs(chars, length, depth + 1, s, used, res);
                used[i] = false;
                if (s.length() == 1) {
                    s = "";
                } else {
                    s = s.substring(0, s.length() - 1);
                }
            }
        }
    }
}
