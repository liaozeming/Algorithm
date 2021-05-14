package Group6;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int size = scanner.nextInt();

            for (int j = 0; j < size; j++) {
                int i = scanner.nextInt();
                int i1 = scanner.nextInt();
                int add = add(i, i1);
                System.out.println(add);
            }
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
