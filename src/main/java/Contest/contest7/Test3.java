package Contest.contest7;

import Group13.Test4;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年04月18日 10:45
 */

public class Test3 {
    public static void main(String[] args) {
        int[] costs = {1,6,3,1,2,5};
        int coins = 20;
        Test3 test3=new Test3();
        int i = test3.maxIceCream(costs, coins);
        System.out.println(i);
    }
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        for (int i = 0; i < costs.length;i++)
        {
            if (costs[i]<=coins)
            {
                sum++;
                coins-=costs[i];
            }else {
                break;
            }
        }
        return sum;
    }


}