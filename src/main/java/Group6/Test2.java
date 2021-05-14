package Group6;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            int i1 = scanner.nextInt();
            int add = add(i, i1);
            if (add != 0) {
                System.out.println(add);
            }
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
