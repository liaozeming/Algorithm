package Group7;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int fib = test1.fib(3);
        System.out.println(fib);
    }

    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
