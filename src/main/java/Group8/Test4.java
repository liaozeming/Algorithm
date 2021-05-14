package Group8;

public class Test4 {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        Test4 test4 = new Test4();
        double maxAverage = test4.findMaxAverage(nums, k);
        System.out.println(maxAverage);
    }

    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        double temp = 0;
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            temp += nums[i];
        }
        max = Math.max(max, temp);
        left++;
        right++;
        while (right < nums.length) {
            double temp1 = temp + nums[right] - nums[left - 1];
            temp = temp1;
            max = Math.max(temp1, max);
            left++;
            right++;
        }
        return max / k;
    }
}
