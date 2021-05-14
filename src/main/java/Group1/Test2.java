package Group1;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        int[] nums = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        Test2 test2 = new Test2();
        int[] res = test2.frequencySort(nums);
        System.out.println(Arrays.toString(res));
    }

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            Integer key = nums[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>();
        list.addAll(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() == o2.getValue()) {
                    return o2.getKey().compareTo(o1.getKey());
                }
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        int j = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            int i = 0;
            for (i = 0; i < entry.getValue(); i++) {
                nums[j + i] = entry.getKey();
            }
            j += i;
           /* // 得到排序后的键值
            System.out.println(entry.getKey());*/
        }
        return nums;
    }
}
