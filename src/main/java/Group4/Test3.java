package Group4;


import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        String s = "bacd", t = "acbde";
        Test3 test3 = new Test3();
        char theDifference = test3.findTheDifference(s, t);
        System.out.println(theDifference);
    }

    public char findTheDifference(String s, String t) {
        char res = 0;
        for (char c : s.toCharArray()) {
            res ^= c;
        }
        for (char c : t.toCharArray()) {
            res ^= c;
        }
        return res;
    }
}
