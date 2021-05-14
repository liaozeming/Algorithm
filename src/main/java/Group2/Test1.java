package Group2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        Test1 test1 = new Test1();
        String s1 = test1.reverseWords(s);
        System.out.println(s1);
    }

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            buffer.append(new StringBuffer(strs[i]).reverse());
            buffer.append(" ");
        }
        return buffer.toString().trim();
    }
}
