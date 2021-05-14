package Group6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            Long temp = Long.valueOf(0);
            for (int i = 0; i < s1.length; i++) {
                temp = add(Long.valueOf((s1[i])), temp);
            }
            System.out.println(temp);
        }
    }

    public static Long add(Long a, Long b) {
        return a + b;
    }
}
