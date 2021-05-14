package Group6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test7 {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 4};
        int target = 6;
        Test7 test7 = new Test7();
        int[] ints = test7.twoSum(numbers, target);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] numbers, int target) {
        // write code
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int res = target - numbers[i];
            if (map.containsKey(res) && i < map.get(res)) {
                map.get(res);
                return new int[]{i + 1, map.get(res) + 1};
            }
        }
        return null;
    }
}
