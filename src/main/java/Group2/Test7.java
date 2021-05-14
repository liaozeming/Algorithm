package Group2;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 3, 12};
        Test7 test7 = new Test7();
        test7.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (nums[left] != 0) {
                left++;
            }
            while (nums[right] == 0) {
                right--;
            }
            swp(nums, left, right);
            left++;
            right--;
        }
    }

    public void swp(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


    /*int i=0;
        for (int k = 0; k < nums.length; k++) {
        if (nums[k]!=0){
            nums[i]=nums[k];
            i++;
        }
    }
        for (int k =nums.length-1; k >=i ; k--) {
        nums[k]=0;
    }*/
}
