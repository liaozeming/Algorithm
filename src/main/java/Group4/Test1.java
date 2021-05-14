package Group4;

public class Test1 {
    public static void main(String[] args) {
        int N = 332;
        Test1 test1 = new Test1();
        int i = test1.monotoneIncreasingDigits(N);
        System.out.println(i);
    }

    public int monotoneIncreasingDigits(int N) {
        /**
         * 思路：
         *  从右向左扫描数字，若发现当前数字比其左边一位（较高位）小，
         *  则把其左边一位数字减1，并将该位及其右边的所有位改成9
         */
        String s = String.valueOf(N);
        int length = s.length();
        char[] chars = s.toCharArray();
        int flag = length;
        for (int i = length - 1; i >= 1; i--) {
            if (chars[i] < chars[i - 1]) {
                flag = i;
                chars[i - 1]--;
            }
        }

        for (int i = flag; i < length; i++) {
            chars[i] = '9';
        }
        return Integer.parseInt(new String(chars));
    }
}
