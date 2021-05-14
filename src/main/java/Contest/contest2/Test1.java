package Contest.contest2;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {7, 9, 1, 1, 1, 3};
        Test1 test1 = new Test1();
        boolean check = test1.check(nums);
        System.out.println(check);
    }

    public boolean check(int[] nums) {
        int length = nums.length;
        int i = 0;
        while (i < length - 1 && nums[i] <= nums[i + 1]) {
            i++;
        }
        if (i == length - 1) {
            return true;
        }
        i++;
        while (i < length - 1 && nums[i] <= nums[i + 1]) {
            i++;
        }
        if (nums[i] > nums[0] || i != length - 1) {
            return false;
        }
        return true;
    }
}
