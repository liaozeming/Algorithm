package Group7;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 2, 4};
        Test3 test3 = new Test3();
        long l = test3.maxWater(arr);
        System.out.println(l);
    }

    public long maxWater(int[] arr) {
        // write code here
        int length = arr.length;
        if (length <= 2) return 0;
        int res = 0;
        for (int i = 1; i < length - 1; i++) {
            int leftmax = 0;
            int rightmax = 0;
            //找左边最大值
            for (int j = 0; j < i; j++) {
                leftmax = Math.max(leftmax, arr[j]);
            }
            //找右边最大值
            for (int t = i + 1; t < length; t++) {
                rightmax = Math.max(rightmax, arr[t]);
            }
            //取左右最大值中的较小一个
            int a = Math.min(leftmax, rightmax);
            //减去当前高度
            if (a > arr[i]) {
                res += a - arr[i];
            }
        }
        return res;
    }
}
