package Contest.contest1;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        Test1 test1 = new Test1();
        int i = test1.sumOfUnique(nums);
        System.out.println(i);
    }

    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }
}
