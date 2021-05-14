package Group8;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        String s = "aa";
        Test3 test3 = new Test3();
        boolean unique = test3.isUnique(s);
        System.out.println(unique);

    }

    public boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        Arrays.sort(chars);
        int length = chars.length - 1;
        for (int i = 0; i <= length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
