package Group5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        Test3 test3 = new Test3();
        int i = test3.eraseOverlapIntervals(intervals);
        System.out.println(i);
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0)
            return 0;
        int[] s = {3, 2, 4};
        Arrays.sort(s);

        List list = new ArrayList();
        list.add(3);
        list.add(2);
        list.add(4);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.toString());
 /*       Arrays.sort(s,new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });*/

        //先排序
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        //记录区间尾部的位置
        int end = intervals[0][1];
        //需要移除的数量
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                //如果重叠了，必须要移除一个，所以count要加1，
                //然后更新尾部的位置，我们取尾部比较小的
                end = Math.min(end, intervals[i][1]);
                count++;
            } else {
                //如果没有重叠，就不需要移除，只需要更新尾部的位置即可
                end = intervals[i][1];
            }
        }
        return count;
    }
}
