package Group9;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        Test4 test4 = new Test4();
        List<Integer> disappearedNumbers = test4.findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers.toString());
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            res[num - 1] = 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
