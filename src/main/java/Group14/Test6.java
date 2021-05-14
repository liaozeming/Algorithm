package Group14;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月09日 10:45
 */

public class Test6 {
    public static void main(String[] args) {
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        Test6 test6 = new Test6();
        int i = test6.maximumPopulation(logs);
        System.out.println(i);
    }

    public int maximumPopulation(int[][] logs) {
        int[] res = new int[logs.length * 2];
        for (int i = 0; i < logs.length; i++) {
            res[i * 2] = logs[i][0];
            res[i * 2 + 1] = logs[i][1];
        }
        int max = Integer.MIN_VALUE;
        int year=logs[0][0];
        for (int i = 0; i < res.length; i++) {
            int num = 0;
            for (int j = 0; j < logs.length; j++) {
                if (logs[j][0] <= res[i] && logs[j][1]-1>= res[i]) {
                    num++;
                }
            }
            if (num>max || (num==max && res[i]<year))
            {
                year=res[i];
            }
            max=Math.max(max,num);
        }
        return year;
    }

}