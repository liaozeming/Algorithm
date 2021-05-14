package Group8;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
    public static void main(String[] args) {
        int lowLimit = 1, highLimit = 10;
        Test5 test5 = new Test5();
        int i = test5.countBalls(lowLimit, highLimit);
        System.out.println(i);
    }

    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            //转变为编号
            int res = ToNum(i);
            map.put(res, map.getOrDefault(res, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        return max;
    }

    private int ToNum(int i) {
        int res = 0;
        while (i > 0) {
            res += i % 10;
            i /= 10;
        }
        return res;
    }
}
