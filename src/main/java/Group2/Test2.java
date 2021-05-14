package Group2;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
        int K = 1;
        Test2 test2 = new Test2();
        int[][] ints = test2.kClosest(points, K);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
    }

    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            int a = Math.abs(points[i][0]);
            int b = Math.abs(points[i][1]);
            map.put(i, a * a + b * b);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>();
        list.addAll(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        int t = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            if (t < K) {
                res[t] = points[entry.getKey()];
                t++;
            } else {
                break;
            }
        }
        return res;
    }
}
