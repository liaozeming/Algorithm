package Group14;

import Group11.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月09日 18:54
 */

public class Test8 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        Test8 test8 = new Test8();
        int i = test8.maxSumMinProduct(nums);
        System.out.println(i);
    }

    public int maxSumMinProduct(int[] nums) {
        long res = Integer.MIN_VALUE;
//      前缀和  preSum[i] 数组nums [0-i]位置的总和
        long[] preSum = new long[nums.length];
        preSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i];
        }
//        维护一个单调递增的栈
        Stack<Integer> stack = new Stack<>();
        //记录nums[i]  最近的左边小于nums[i]的位置
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        //第一个位置nums[0] 左边赋特值判断  nums[nums.length-1]  右边赋特值判断
        left[0] = -1;
        right[nums.length - 1] = nums.length;
        for (int i = 0; i < nums.length; i++) {
            //如果栈顶的下标对应的nums值大于当前遍历的nums[i]的话
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                //弹出栈
                int pop = stack.pop();
                //此时弹出栈右边的最小元素下标为i
                right[pop] = i;

            }
//            当前值左边最近的小于当前的数下标
            if (stack.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            right[stack.pop()] = nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            //以i为中心的最小值,找出左右连续都大于它的范围
            int rangeLeft = left[i] + 1;
            int rangeRight = right[i] - 1;
            //[rangeLeft,i,rangeRight]
            long sum = 0;
            if (rangeLeft == 0) {
                sum =nums[i]* preSum[rangeRight];
            } else {
                sum =nums[i]* ( preSum[rangeRight] - preSum[rangeLeft - 1]);
            }
            res = Math.max(res, sum);
        }
        return (int) res%1000000007;
    }


}