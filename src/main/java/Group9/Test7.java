package Group9;

public class Test7 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        Test7 test7 = new Test7();
        int maxConsecutiveOnes = test7.findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < length) {
            while (right < length && nums[right] == 1) {
                right++;
            }
            max = Math.max(max, right - left);
            while (right < length && nums[right] != 1) {
                right++;
            }
            left = right;
        }
        return max;
    }
}
