package Group9;

public class Test8 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 8, 2};
        int maxOperations = 2;
        Test8 test8 = new Test8();
        int i = test8.minimumSize(nums, maxOperations);
        System.out.println(i);
    }

    public int minimumSize(int[] nums, int maxOperations) {

        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        // 求满足条件的最小值，二分左边界模板 对袋子装球的数量就行二分法，数量越多，需要分的袋子就越小=maxOperations
        //如果是1的话，则每个大于1的袋子都需要分，max 的话则不需要分
        int left = 1, right = max;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (check(mid, maxOperations, nums)) {
                //说明当前给的每个袋子最大数满足条件，那么就缩小给定的袋子装球数目
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    //max一个袋子放多少球
    public boolean check(int max, int maxOperations, int[] nums) {
        //计算需要操作次数
        int cnt = 0;
        for (int num : nums) {
            //比如一个袋子内有10个球  现在如果要求每个袋子不超过max=5个球，需要分一次  （10-1）/5=1
            cnt += (num - 1) / max;
        }
        //如果每个袋子的需要操作的次数小于给定的次数，返回ture
        return cnt <= maxOperations;
    }
}
