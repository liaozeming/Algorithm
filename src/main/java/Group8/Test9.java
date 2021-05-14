package Group8;


import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 3};
        Test9 test9 = new Test9();
        boolean b = test9.checkPossibility(nums);
        System.out.println(b);
    }

    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return true;
        }
        int cnt = 0;
        for (int i = 1; i < nums.length && cnt < 2; i++) {
            if (nums[i - 1] <= nums[i]) {
                continue;
            }
            cnt++;
            if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        list.remove(1);
        return cnt <= 1;
    }
}
