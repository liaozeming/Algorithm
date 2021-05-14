package Group1;

import java.util.Arrays;

//1356. 根据数字二进制下 1 的数目排序
public class Test7 {
    public static void main(String[] args) {
        Test7 test7 = new Test7();
        int[] arr = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        int[] ints = test7.sortByBits(arr);
        System.out.println(Arrays.toString(ints));
    }

    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (o1, o2) -> {
            int bitCountA = Integer.bitCount(o1);
            int bitCountB = Integer.bitCount(o2);
            // 相同按原数，不同按位数
            return bitCountA == bitCountB ? o1 - o2 : bitCountA - bitCountB;
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        return arr;
    }
}
