package Group11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {2, 1};
        Test1 test1 = new Test1();
        int shortestSubArray = test1.findShortestSubArray(nums);
        System.out.println(shortestSubArray);
    }

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        List<Integer> list = new ArrayList<>();
        //找出最大频率的数
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max == entry.getValue()) {
                list.add(entry.getKey());
            }
        }
        if (max == 1) return 1;
        int res = nums.length;
//        将最大频率的数的左右下标求出来
        for (int i = 0; i < list.size(); i++) {
            int k = list.get(i);
            int left = 0;
            int right = 0;
            boolean first = true;
            for (int j = 0; j < nums.length; j++) {
                if (k == nums[j] && first == true) {
                    left = j;
                    first = false;
                } else if (k == nums[j]) {
                    right = j;
                }
            }
            res = Math.min(res, right - left + 1);
        }
        return res;
    }
}
