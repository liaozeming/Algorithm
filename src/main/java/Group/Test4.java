package Group;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        String s1 = scanner.nextLine().toLowerCase();
        int res = CountNum(s, s1);
        System.out.println(res);
    }

    private static int CountNum(String s, String s1) {
        char c = s1.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
