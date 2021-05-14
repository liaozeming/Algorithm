package Group14;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月05日 10:19
 */

public class Test2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        Test2 test2 = new Test2();
        int rob = test2.rob(nums);
        System.out.println(rob);
    }
//    把环拆成两个队列，一个是从0到n-1，另一个是从1到n，然后返回两个结果最大的
    public int rob(int[] nums) {
        if (nums.length==1) return nums[0];
        if (nums.length==2) return Math.max(nums[0],nums[1]);
        int[] array1=new int[nums.length-1];
        int[] array2=new int[nums.length-1];
        for (int i = 0; i < nums.length-1; i++) {
            array1[i]=nums[i];
        }
        for (int i = 0; i < nums.length-1; i++) {
            array2[i]=nums[i+1];
        }

        int[] dp1=new int[array1.length];
        dp1[0]=array1[0];
        dp1[1]=Math.max(array1[0],array1[1]);
        for (int i = 2; i < array1.length; i++) {
            dp1[i]=Math.max(dp1[i-1],dp1[i-2]+array1[i]);
        }
        int[] dp2=new int[array2.length];
        dp2[0]=array2[0];
        dp2[1]=Math.max(array2[0],array2[1]);
        for (int i = 2; i < array2.length; i++) {
            dp2[i]=Math.max(dp2[i-1],dp2[i-2]+array2[i]);
        }
        return Math.max(dp1[array1.length-1],dp2[array2.length-1]);
    }
}