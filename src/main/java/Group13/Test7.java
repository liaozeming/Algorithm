package Group13;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年04月17日 10:48
 */

public class Test7 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 9, 1, 5, 9};
        int k = 2, t = 3;
        Test7 test7 = new Test7();
        boolean b = test7.containsNearbyAlmostDuplicate(nums, k, t);
        System.out.println(b);
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//        判定当前元素的左右边界值是否存在在set集合中
        int n = nums.length;
        TreeSet<Long> set = new TreeSet<Long>();
        for (int i = 0; i < n; i++) {
            //返回给定大于等于给定元素的最小元素
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }


//                int n = nums.length;
//        Map<Long, Long> map = new HashMap<Long, Long>();
//        //桶的大小为 t + 1
//        //如果两个元素同属一个桶，那么这两个元素必然符合条件
//        //如果两个元素属于相邻桶，那么我们需要校验这两个元素是否差值不超过 t
//        long w = (long) t + 1;
//        for (int i = 0; i < n; i++) {
//            long id = getID(nums[i], w);
//            if (map.containsKey(id)) {
//                return true;
//            }
//            //检查相邻的桶
//            if (map.containsKey(id - 1) && Math.abs(nums[i] - map.get(id - 1)) < w) {
//                return true;
//            }
//            if (map.containsKey(id + 1) && Math.abs(nums[i] - map.get(id + 1)) < w) {
//                return true;
//            }
//            //如果不满足将其放入桶中
//            map.put(id, (long) nums[i]);
//            // 删除超出边界的元素
//
//            if (i >= k) {
//                map.remove(getID(nums[i - k],w));
//            }
//        }
//        return false;
//    }
//
//
//    //得到放入桶的id
//    //T=5, 0-5 在0 桶
//    //-6 - -1  在 -1桶(整体往右偏移一个单位后除以w得到的桶数减一)
//    public long getID(long x, long w) {
//        if (x >= 0) {
//            return x / w;
//        }
//        return (x + 1) / w - 1;
//    }
}