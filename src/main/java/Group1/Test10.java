package Group1;

import java.util.*;

public class Test10 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        Test10 test10 = new Test10();
        int[] intersection = test10.intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            int i1 = nums1[i];
            for (int j = 0; j < nums2.length; j++) {
                if (i1 == nums2[j]) {
                    set.add(i1);
                    break;
                }
            }
        }
        int i = 0;
        int[] res = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            res[i] = it.next();
            i++;
        }
        return res;
    }
}
