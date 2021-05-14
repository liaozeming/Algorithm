package Group5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            //学生数目
            int s1 = scanner.nextInt();
            //操作数目
            int s2 = scanner.nextInt();
            int[] score = new int[s1];
            for (int i = 0; i < s1; i++) {
                int temp = scanner.nextInt();
                score[i] = temp;
            }
            for (int i = 0; i < s2; i++) {
                String next = scanner.next();
                int k1 = scanner.nextInt();
                int k2 = scanner.nextInt();
                if (next.equals("Q")) {
                    if (k1 > k2) {
                        process(next, k2, k1, score);
                    } else {
                        process(next, k1, k2, score);
                    }
                } else {
                    process(next, k1, k2, score);
                }
            }
        }


    }

    private static void process(String next, int k1, int k2, int[] score) {
//        查询
        if (next.equals("Q")) {
            int Max = Integer.MIN_VALUE;
            for (int i = k1; i <= k2; i++) {
                Max = Math.max(Max, score[i - 1]);
            }
            System.out.println(Max);
        } else {
            //更新
            score[k1 - 1] = k2;
        }
    }
}
