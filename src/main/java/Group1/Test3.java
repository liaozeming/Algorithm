package Group1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//57. 插入区间
public class Test3 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        Test3 test3 = new Test3();
        int[][] insert = test3.insert(intervals, newInterval);
        for (int i = 0; i < insert.length; i++) {
            System.out.println(Arrays.toString(insert[i]));
        }
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
//       新插入的左边界大于数组的右边界
        while (i < intervals.length && newInterval[0] > intervals[i][1]) {
            res.add(intervals[i]);
            i++;
        }
        int[] temp = new int[]{newInterval[0], newInterval[1]};
        while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
            temp[0] = Math.min(temp[0], intervals[i][0]);
            temp[1] = Math.max(temp[1], intervals[i][1]);
            i++;
        }
        res.add(temp);

        while (i < intervals.length) {
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[0][]);
    }
}
