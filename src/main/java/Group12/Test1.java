package Group12;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        Test1 test1 = new Test1();
        int[] ints = test1.nextGreaterElements(nums);
        System.out.println(Arrays.toString(ints));
    }

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        Arrays.fill(ret, -1);
        Deque<Integer> stack = new LinkedList<Integer>();
        for (int i = 0; i < n * 2 - 1; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                ret[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);
        }
        return ret;
    }
}
