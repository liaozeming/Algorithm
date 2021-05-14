package Group13;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Test4 test4=new Test4();
        while (scanner.hasNext())
        {
            int i = scanner.nextInt();
            int ugly = test4.nthUglyNumber(i);
            System.out.println(ugly);
        }
    }

    public int nthUglyNumber(int n) {
//        int[] factors = {2, 3, 5};
//        Set<Long> seen = new HashSet<Long>();
//        PriorityQueue<Long> heap = new PriorityQueue<Long>();
////最大堆和最小堆
///*        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); //小顶堆，默认容量为11
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11,new Comparator<Integer>(){ //大顶堆，容量11
//            @Override
//            public int compare(Integer i1,Integer i2){
//                return i2-i1;
//            }
//        });*/
//
//        seen.add(1L);
//        heap.offer(1L);
//        int ugly = 0;
//        int max=0;
//        for (int i = 0; i < n; i++) {
//            long curr = heap.poll();
//            ugly = (int) curr;
//            for (int factor : factors) {
//                long next = curr * factor;
//                if (seen.add(next)) {
//                    heap.offer(next);
//                }
//            }
//        }
//        return ugly;

// 1 打头，1 乘 2 1 乘 3 1 乘 5，现在是 {1,2,3,5}
//轮到 2，2 乘 2 2 乘 3 2 乘 5，现在是 {1,2,3,4,5,6,10}
//手写的过程和采用小顶堆的方法很像，但是怎么做到提前排序呢
//
//小顶堆的方法是先存再排，dp 的方法则是先排再存
//我们设 3 个指针 p_2,p_3,p_5
//代表的是第几个数的2倍、第几个数 3 倍、第几个数 5 倍
//动态方程 dp[i]=min(dp[p_2]*2,dp[p_3]*3,dp[p_5]*5)
//小顶堆是一个元素出来然后存 3 个元素
//动态规划则是标识 3 个元素，通过比较他们的 2 倍、3 倍、5 倍的大小，来一个一个存
        int[] dp = new int[n];
        int a = 0 , b = 0, c = 0;
        dp[0] = 1;
        for(int i = 1;i < n;i++){
            int x = 2 * dp[a] , y = 3 * dp[b], z = 5 * dp[c];
            dp[i] = Math.min(Math.min(x,y),z);
            if(dp[i] == x) a++;
            if(dp[i] == y) b++;
            if(dp[i] == z) c++;
        }
        return dp[n - 1];

    }


}
