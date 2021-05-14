package Group2;

import Group1.Test4;

import java.util.Arrays;

//https://leetcode-cn.com/problems/next-permutation/solution/xia-yi-ge-pai-lie-suan-fa-xiang-jie-si-lu-tui-dao-/
public class Test3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 8, 5, 7, 6, 4};
        Test3 test3 = new Test3();
        test3.nextPermutation(nums);
    }

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int firstIndex = -1;
        //首先从后向前查找第一个相邻升序的元素对 (i,j)
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                firstIndex = i;
                break;
            }
        }
        //如果i=-1时则是最大值，逆序就是最小值
        if (firstIndex == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int secondIndex = -1;
        //然后在 从后向前查找第一个大于 A[firstIndex] 的值 A[secondIndex]
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[firstIndex]) {
                secondIndex = i;
                break;
            }
        }
//        将 A[firstIndex] 与 A[secondIndex] 交换
        swap(nums, firstIndex, secondIndex);
        //这时 [secondIndex,end) 必然是降序，逆置 [secondIndex,end)，使其升序
        reverse(nums, firstIndex + 1, nums.length - 1);
        return;

    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    private void swap(int[] nums, int i, int i1) {
        int tmp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = tmp;
    }

}
