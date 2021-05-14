package Group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String s = scanner.nextLine();
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            list.add(Integer.valueOf(split[i]));
        }

        int res = calculate(list);
        System.out.println(res);
    }

    private static int calculate(List<Integer> list) {
        //处理特殊情况
        if (list.contains(2) && list.contains(5)) {
            return -1;
        }
        if (list.contains(6) && list.contains(9)) {
            return -1;
        }
        if (list.contains(2)) {
            list.add(5);
        }
        if (list.contains(5)) {
            list.add(2);
        }
        if (list.contains(6)) {
            list.add(9);
        }
        if (list.contains(9)) {
            list.add(6);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 9 || list.get(i) < 1) {
                return -1;
            }
            res[i] = list.get(i);
        }
        Arrays.sort(res);
        //有多少个数
        int max = res[res.length - 1];
        int[] s = new int[max];
        for (int i = 0; i < res.length; i++) {
            s[i] = res[i];
        }
        int temp = res.length;
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                if (temp == max) {
                    break;
                }
                if (i == j) {
                    continue;
                } else {
                    int a = res[i] * 10 + res[j];
                    if ((a == 25) || (a == 52) || (a == 69) || (a == 96)) {
                        continue;
                    } else {
                        s[temp] = a;
                        temp++;
                    }
                }
            }
        }
        return s[max - 1];
    }

}
