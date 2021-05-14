package Group12;

import java.util.Arrays;
import java.util.Comparator;

//最长子序列
public class Test9 {

    public static void main(String[] args) {
        int[] res={-2,11,-4,13,-5,-2};
        Test9 test9=new Test9();
        int i = test9.LongString(res);
        System.out.println(i);
    }

    //前缀和
    public int LongString(int[] res){
        /*int[] sum=new int[res.length];
        int temp=0;
        for (int i = 0; i <sum.length ; i++) {
            sum[i]=temp+res[i];
            temp=sum[i];
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < sum.length-1; i++) {
            for (int j = i+1; j <sum.length ; j++) {
                max=Math.max(max,sum[j]-sum[i]);
            }
        }
        return max;*/
        Integer[] dp=new Integer[res.length+1];

        dp[0]=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < res.length; i++) {
            dp[i+1]=Math.max(res[i],dp[i]+res[i]);
            max=Math.max(max,dp[i+1]);
        }
        return  max;
    }
}
