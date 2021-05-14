package Group11;

public class Test2 {
    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 4, 7, 2};
        int limit = 5;
        Test2 test2 = new Test2();
        int i = test2.longestSubarray(nums, limit);
        System.out.println(i);
    }

    public int longestSubarray(int[] nums, int limit) {
        int length = nums.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (IsContent(nums, i, j, limit)) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    private boolean IsContent(int[] nums, int i, int j, int limit) {
        int[] temp = new int[j - i + 1];
        for (int k = i; k <= j; k++) {
            temp[k - i] = nums[k];
        }
        for (int k = 0; k < temp.length; k++) {
            for (int l = 0; l < temp.length; l++) {
                if (Math.abs(temp[k] - temp[l]) > limit) {
                    return false;
                }
            }
        }
        return true;
    }
}
