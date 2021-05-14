package Group;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //进制参数
        int i = scanner.nextInt();
        if (i < 2 || i > 35) {
            System.out.println("-1");
        } else {
            String a = scanner.next();
            String b = scanner.next();
            String calculate = calculate(a, b, i);
            System.out.println(calculate);
        }
    }

    public static String calculate(String a, String b, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        //判断a b字符串是否合法
        if (isRight(a) && isRight(b)) {
            //被减数
            char[] chars = a.toCharArray();
            //转换为数字
            int i1 = ToNum(chars, i);
            //减数
            char[] chars1 = b.toCharArray();
            int i2 = ToNum(chars1, i);
            int res = i1 - i2;
            StringBuffer stringBuffer1 = new StringBuffer();
            if (res >= 0) {
                stringBuffer.append("0").append(" ");
                //转为进制
                List list = ToChange(res, i);
                for (int j = 0; j < list.size(); j++) {
                    stringBuffer1.append(list.get(j));
                }
                stringBuffer.append(stringBuffer1);
            } else {
                stringBuffer.append("1").append(" ");
                //转为进制
                List list = ToChange(-1 * res, i);
                stringBuffer.append(stringBuffer1);
            }
        } else {
            return "-1";
        }
        return String.valueOf(stringBuffer);
    }

    //转换为进制
    private static List ToChange(int res, int i) {
        List list = new ArrayList();
        while (res >= i) {
            int a = res % i;
            res = res / 2;
            list.add(a);
        }
        list.add(res);
        Collections.reverse(list);
        return list;
    }

    private static int ToNum(char[] chars, int i) {
        int length = chars.length;
        int res = 0;
        int temp = 1;
        for (int j = length - 1; j >= 0; j--) {
            int i1 = chars[j] - '0';
            if (j == length - 1) {
                temp = 1;
            } else {
                temp = temp * i;
            }
            res += i1 * temp;
        }
        return res;
    }

    private static boolean isRight(String s) {
        char[] chars = s.toCharArray();
        if (chars.length != 1 && chars[0] == '0') {
            return false;
        } else if (chars.length > 100) {
            return false;
        }
        return true;
    }
}
