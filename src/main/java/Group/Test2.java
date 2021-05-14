package Group;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        行列
        int a = scanner.nextInt();
        //行长
        int b = scanner.nextInt();
        int[][] list = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                list[i][j] = scanner.nextInt();
            }
        }
        int res = calculate(list, a, b);
        System.out.println(res);
    }

    private static int calculate(int[][] list, int a, int b) {
        int[][] res = new int[a][b];
        res[0][0] = list[0][0];
        int max = res[0][0];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                //说明有上半部
                if (i >= 1) {
                    res[i][j] = Math.max(list[i][j], res[i - 1][j] + list[i][j]);
                }
                //说明有左半部
                if (j >= 1) {
                    res[i][j] = Math.max(list[i][j], res[i][j - 1] + list[i][j]);
                }
                if (i >= 1 && j >= 1) {
                    res[i][j] = Math.max(list[i][j], res[i - 1][j - 1] + list[i][j - 1] + list[i - 1][j] + list[i][j]);
                }
                max = Math.max(max, res[i][j]);
            }
        }
        return max;
    }

}
