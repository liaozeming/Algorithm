package Work1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        int a = getNumZero(next);
        System.out.println(a);
    }

    private static int getNumZero(String next) {
        char[] chars = next.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                res++;
            }
        }
        return res;
    }
}
