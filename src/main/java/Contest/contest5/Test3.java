package Contest.contest5;

public class Test3 {
    public static void main(String[] args) {
        int[] nums = {-5, -3, -3, -2, 7, 1};
        int[] multipliers = {-10, -5, 3, 4, 6};
        Test3 test3 = new Test3();
        int i = test3.maximumScore(nums, multipliers);
        System.out.println(i);
    }

    public int maximumScore(int[] nums, int[] multipliers) {
        int m = multipliers.length;
        int[][] dp = new int[m + 1][m + 1];
        dp[1][0] = nums[0] * multipliers[0];
        dp[0][1] = nums[nums.length - 1] * multipliers[0];
        //i选择的个数总和
        for (int i = 2; i <= m; i++) {
            //权重值
            int mul = multipliers[i - 1];
            //l:左边选择的个数
            for (int l = 0; l <= i; l++) {
                //右边选择的个数
                int r = i - l;
                //得到数组下标
                int nums_index = nums.length - (i - l);
                if (l == 0) {
                    //左边选l个右边选r个：左边选l个，右边选r-1个+nums右边第r个的数*权重
                    dp[l][r] = dp[l][r - 1] + mul * nums[nums_index];
                    continue;
                }
                if (r == 0) {
                    //左边选l个右边选r个：左边选l-1个，右边选r个+nums左边边第l个的数*权重
                    dp[l][r] = dp[l - 1][r] + mul * nums[l - 1];
                    continue;
                }
                dp[l][r] = dp[l - 1][r] + mul * nums[l - 1];
                dp[l][r] = Math.max(dp[l][r], dp[l][r - 1] + mul * nums[nums_index]);
            }
        }
        int ans = Integer.MIN_VALUE;
        //m步   i：左边选的个数
        for (int i = 0; i <= m; i++) {
            ans = Math.max(dp[i][m - i], ans);
        }
        return ans;
    }
}
