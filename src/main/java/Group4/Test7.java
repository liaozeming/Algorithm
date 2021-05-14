package Group4;

public class Test7 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 2, 1};
        int[] B = {3, 2, 1, 4, 7};
        Test7 test7 = new Test7();
        int length = test7.findLength(A, B);
        System.out.println(length);
    }

    public int findLength(int[] A, int[] B) {
        //动态规划
        int max = 0;
        //把数组长和宽都增加了1，也就是数组的第一行和第一列都是不保存数据的，
        // 所以要计算dp[i][j]比较的就是A[i-1]==B[j-1]
        int[][] dp = new int[A.length + 1][B.length + 1];
        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= B.length; j++) {
                if (A[i - 1] == B[j - 1])
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = 0;
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}
