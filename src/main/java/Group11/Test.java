package Group11;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<double[]> points = new ArrayList<>();
        points.add(new double[]{0, 0});
        points.add(new double[]{1, 1});
        points.add(new double[]{2, 0.5});
        points.add(new double[]{3, 1});
        points.add(new double[]{4, 0});
        Test test = new Test();
        double[] point = {2, 0.75};
        boolean contains = test.contains(points, point);
        System.out.println(contains);
    }

    public boolean contains(List<double[]> points, double[] point) {
        //根据横坐标点对points升序排序
        Collections.sort(points, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                if (o1[0] > o2[0]) {
                    return 1;
                }
                return -1;
            }
        });
        //对横坐标特判
        if (point[0] < points.get(0)[0] || point[0] > points.get(points.size() - 1)[0]) {
            return false;
        }
        for (int i = 0; i < points.size() - 1; i++) {
            //得到两点
            double[] first = points.get(i);
            double[] second = points.get(i + 1);

        }
        return true;
    }
}
