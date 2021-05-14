package Group3;

import java.util.Arrays;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        int[][] points = {{3, 9}, {7, 12}, {3, 8}, {6, 8}, {9, 10}, {2, 9}, {0, 9}, {3, 9}, {0, 6}, {2, 8}};
        Test1 test1 = new Test1();
        int minArrowShots = test1.findMinArrowShots(points);
        System.out.println(minArrowShots);
    }

    public int findMinArrowShots(int[][] points) {
        int[][] res = new int[points.length][2];
        boolean[] booleans = new boolean[points.length];
        Arrays.fill(booleans, true);
        int shots = 0;
        for (int i = 0; i < points.length; i++) {
            if (booleans[i] == false) {
                continue;
            }
            booleans[i] = false;
            int tempLeft = points[i][0];
            int tempRight = points[i][1];
            for (int j = i + 1; j < points.length; j++) {
                if (booleans[j] == false) {
                    continue;
                }
                int left = points[j][0];
                int right = points[j][1];
                if (tempLeft <= left && tempRight >= left || left <= tempLeft && right >= tempLeft ||
                        tempLeft <= right && tempRight >= right || left <= tempRight && right >= tempRight) {
                    booleans[j] = false;
                    tempLeft = Math.max(tempLeft, left);
                    tempRight = Math.min(tempRight, right);
                }
            }

            int[] temp = {tempLeft, tempRight};
            res[shots] = temp;
            shots++;
        }
        return shots;
    }
}
