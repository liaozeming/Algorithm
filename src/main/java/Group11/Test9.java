package Group11;

import java.util.Arrays;
import java.util.Hashtable;

public class Test9 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        int num = 5;
        Test9 test9 = new Test9();
        int[] ints = test9.countBits(num);
        System.out.println(Arrays.toString(ints));
    }

    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int temp = getBit(i);
            res[i] = temp;
        }
        return res;
    }

    private int getBit(int i) {
        int res = 0;
        while (i > 0) {
            if (i % 2 == 1) {
                res++;
            }
            i /= 2;
        }
        return res;
    }
}
