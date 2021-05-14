package Group13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Test1 test1=new Test1();
        while (scanner.hasNext())
        {
            int i = scanner.nextInt();
            boolean ugly = test1.isUgly(i);
            System.out.println(ugly);
        }
    }

    public boolean isUgly(int n) {
        if (n<1) return false;
        while (n%2==0)
        {
            n/=2;
        }
        while (n%3==0)
        {
            n/=3;
        }
        while (n%5==0)
        {
            n/=5;
        }
        return n==1;
    }
}
