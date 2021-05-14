package Group14;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月05日 10:03
 */

import Group11.Test;

/**
 * dp[i] 表示删除元素i所能获得的最大点数
 * c[i] 表示元素i的个数
 * <p>
 * 元素i的选择有删除和不删除两种状态，如果删除i，获得的点数是 dp[i] = dp[i - 2] + i * c[i]
 * 如果不删i，获得的点数是 dp[i - 1]
 * 因此转移方程为：dp[i] = max(dp[i - 1],dp[i - 2] + i * c[i]dp[i]=max(dp[i−1],dp[i−2]+i∗c[i]
 **/

public class Test1 {

    public static void main(String[] args) {
       int[] nums = {2,2,3,3,3,4};
        Test1 test1=new Test1();
        int i = test1.deleteAndEarn(nums);
        System.out.println(i);
    }


    public int deleteAndEarn(int[] nums) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max=Math.max(max,nums[i]);
        }
        int[] all=new int[max+1];
        for (int i = 0; i < nums.length; i++) {
            all[nums[i]]+=1;  //统计各个数字出现的个数
        }
        int[] dp=new int[max+1];
        dp[0]=0;
        dp[1]=all[1]*1;
        for (int i = 2; i <max+1 ; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+all[i]*i);
        }
        return dp[max];
    }
}