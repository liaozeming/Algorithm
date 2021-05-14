package Contest.contest3;

public class Test2 {
    public static void main(String[] args) {
        String s = "zzzzz";
        Test2 test2 = new Test2();
        int i = test2.countHomogenous(s);
        System.out.println(i);
    }

    public int countHomogenous(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 1) return 1;
        int left = 0, right = 0;
        int count = 0;
        long res = 0;
        while (right < chars.length) {
            count = 0;
            while (right < chars.length && chars[left] == chars[right]) {
                right++;
            }
            count += right - left;
            left = right;
            res += getNum(count);
        }
        return (int) (res % 1000000007);
    }

    private long getNum(int count) {
        long res = 0;
        while (count > 0) {
            res += count;
            count--;
        }
        return res;
    }
}
