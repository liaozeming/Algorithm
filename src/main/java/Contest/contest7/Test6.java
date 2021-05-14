package Contest.contest7;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年04月18日 11:30
 */

public class Test6 {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        Test6 test6=new Test6();
        int i = test6.removeDuplicates(nums);
        System.out.println(i);
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length==1) return 1;
        int left=0;
        int right=1;
        while (right<nums.length)
        {
            if (nums[left]!=nums[right])
            {
                left++;
                nums[left]=nums[right];
            }
            right++;
        }
        return left+1;
    }

}