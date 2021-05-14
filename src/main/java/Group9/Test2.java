package Group9;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        String[] split = s.split(",");
        int res = Calculate(split);
        System.out.println(res);
    }

    private static int Calculate(String[] split) {
        String region = split[0];
        String copy = split[1];
        int[] res = new int[26];
        int[] temp = new int[26];
        int m = 0;
        for (int i = 0; i < region.length(); i++) {
            char c = region.charAt(i);
            res[c - 'a'] += 1;
        }
        for (int i = 0; i < copy.length(); i++) {
            char c = copy.charAt(i);
            temp[c - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            m += Math.abs(res[i] - temp[i]);
        }
        return m;
    }
}
