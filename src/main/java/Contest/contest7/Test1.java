package Contest.contest7;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年04月17日 19:06
 */

public class Test1 {
    public static void main(String[] args) {
        int[] bucket = {1, 3};
        int[] vat = {6, 8};
        Test1 test1 = new Test1();
        int i = test1.storeWater(bucket, vat);
        System.out.println(i);
    }

    public int storeWater(int[] bucket, int[] vat) {
        //找出水缸的最大容量
        int max = Arrays.stream(vat).max().orElse(-1);
        if (max == 0) {
            return 0;
        }
        int n = bucket.length;
        int cost = (int) 1e9;
//        遍历倒水次数
        for (int i = 1; i <= 10000; i++) {
//             每个水桶都是倒i次水
            int contrib = i;
//            遍历每个水桶，查出至少需要升级的次数
            for (int j = 0; j < n; j++) {
//             atleast=升级完成后的桶容量
//             atleast - bucket[j]= 每个水桶至少需要升级的次数
//             eg:例如倒了三次水  i=3,水缸容量为10 则桶容量至少为(10+3-1)/3=4次
//             如果水缸容量为9  则桶容量只需要3 即(9+3-1)/3=3
                int atleast = (vat[j] + i - 1) / i;
//             总共操作的次数=每个桶升级的次数(atleast - bucket[j]）+倒水的次数(i次=contrib)
                contrib += Math.max(0, atleast - bucket[j]);
            }
            cost = Math.min(cost, contrib);
        }
        return cost;
    }

}