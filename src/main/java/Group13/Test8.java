package Group13;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年04月19日 6:06
 */

public class Test8 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int cal=2;
        Test8 test8=new Test8();
        int i = test8.removeElement(nums, cal);
        System.out.println(i);
    }

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}