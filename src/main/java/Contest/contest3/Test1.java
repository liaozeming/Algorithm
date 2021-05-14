package Contest.contest3;

public class Test1 {
    public static void main(String[] args) {
        String s = "10";
        Test1 test1 = new Test1();
        int i = test1.minOperations(s);
        System.out.println(i);
    }

    public int minOperations(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 1) return 0;
        //第一位数是0
        char temp = '0';
        char temp1 = '1';
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != temp) {
                count++;
            }
            if (i % 2 == 0) {
                temp = '1';
            } else {
                temp = '0';
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != temp1) {
                count1++;
            }
            if (i % 2 == 0) {
                temp1 = '0';
            } else {
                temp1 = '1';
            }
        }
        return Math.min(count, count1);
    }
}
