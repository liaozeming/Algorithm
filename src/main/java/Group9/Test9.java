package Group9;

public class Test9 {
    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};
        Test9 test9 = new Test9();
        int i = test9.arrayPairSum(nums);
        System.out.println(i);
    }

    public int arrayPairSum(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        int len = nums.length;
        int re = 0;
        for (int i = 0; i < len; i += 2) {
            re += nums[i];
        }
        return re;
    }

    static void quicksort(int[] nums, int start, int end) {
        if (start > end) return;
        //init
        int qs = start;
        int qe = end;
        int key = nums[qs];
        //quicksort
        while (qs < qe) {
            while (qs < qe && nums[qe] >= key) qe--;
            while (qs < qe && nums[qs] <= key) qs++;
            if (qs < qe) {
                int current = nums[qe];
                nums[qe] = nums[qs];
                nums[qs] = current;
            }
        }
        nums[start] = nums[qe];
        nums[qe] = key;
        quicksort(nums, start, qe - 1);
        quicksort(nums, qe + 1, end);
    }

}
