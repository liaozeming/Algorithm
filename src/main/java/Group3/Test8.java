package Group3;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//659. 分割数组为连续子序列
public class Test8 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 5};
        Test8 test8 = new Test8();
        boolean possible = test8.isPossible(nums);
        System.out.println(possible);
    }

    public boolean isPossible(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<Integer, PriorityQueue<Integer>>();
        for (int x : nums) {
            if (!map.containsKey(x)) {
                map.put(x, new PriorityQueue<Integer>());
            }
            if (map.containsKey(x - 1)) {
                int prevLength = map.get(x - 1).poll();
                if (map.get(x - 1).isEmpty()) {
                    map.remove(x - 1);
                }
                map.get(x).offer(prevLength + 1);
            } else {
                map.get(x).offer(1);
            }
        }
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
            PriorityQueue<Integer> queue = entry.getValue();
            if (queue.peek() < 3) {
                return false;
            }
        }
        return true;
    }
}
