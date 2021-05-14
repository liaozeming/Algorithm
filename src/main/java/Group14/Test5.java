package Group14;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月09日 9:32
 */

public class Test5 {
    public static void main(String[] args) {
        int[]  bloomDay = {7,7,7,7,12,7,7};
        int m = 2, k = 3;
        Test5 test5=new Test5();
        int i = test5.minDays(bloomDay, m, k);
        System.out.println(i);
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if (m*k>bloomDay.length) return -1;
        //找出最早和最晚开放的花
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        //采用二分法判断最少需要的天数
        int Day=0;
        while (min<max)
        {
             Day=min+(max-min)/2;
            //判断花能否在Day天摘到
            if (IsCatch(bloomDay,Day,m,k))
            {
                max=Day;
            }else {
                min=Day+1;
            }
        }
        return min;
    }

//    day 天数  m :m束花  k：相邻k朵
    private boolean IsCatch(int[] bloomDay, int day, int m, int k) {
        //是否开花数组
        boolean[] isBloom=new boolean[bloomDay.length];
        for (int i = 0; i < bloomDay.length; i++) {
            isBloom[i]=bloomDay[i]<=day;
        }
        int flowers=0;
        for (int i = 0; i < isBloom.length && m>0; i++) {
            if (isBloom[i])
            {
             flowers++;
             if (flowers==k)
             {
                 m--;
                 flowers=0;
             }
            }else {
                flowers=0;
            }
        }
        return m==0;
    }

}