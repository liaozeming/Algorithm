package Simple.array;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        Test1 test1 = new Test1();
        int i = test1.removeDuplicates(nums);
        System.out.println(i);
    }

    /**
     * @Author: lzm
     * @Description:
     * @Date: 2020/10/1
     * @Param nums:
     * @return: int
     * 删除排序数组中的重复项
     **/

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 1) return length;
        int i = 0, j = 1;
        while (j < length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}
