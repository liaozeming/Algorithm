package Contest.contest1;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] nums = {1, -3, 2, 3, -4};
        Test2 test2 = new Test2();
        int i = test2.maxAbsoluteSum(nums);
        System.out.println(i);
    }

    public int maxAbsoluteSum(int[] nums) {
        int[] res = new int[nums.length];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            res[i] = temp + nums[i];
            temp = temp + nums[i];
        }
        Arrays.sort(res);
        int max = Integer.MIN_VALUE;
        max = Math.max(max, -res[0]);
        max = Math.max(max, res[res.length - 1]);
        max = Math.max(max, res[res.length - 1] - res[0]);
        return max;

/*//        相当于走一遍子序列最大值，再走一遍子序列最小值
        int ans = 0;
        // 相加为正数
        int right = 0, sum = 0, n = nums.length;
        while(right < n){
            sum += nums[right++];
            if(sum < 0){
                sum = 0;
            }else{
                ans = Math.max(ans, sum);
            }
        }
        sum = 0;
        right = 0;
        // 相加为负数
        while(right < n){
            sum += nums[right++];
            if(sum > 0){
                sum = 0;
            }else{
                ans = Math.max(ans, -sum);
            }
        }
        return ans;*/

    }
}
