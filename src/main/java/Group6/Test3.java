package Group6;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            int temp = 0;
            for (int i = 0; i < s1.length; i++) {
                temp = add(Integer.parseInt(s1[i]), temp);
            }
            System.out.println(temp);
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
