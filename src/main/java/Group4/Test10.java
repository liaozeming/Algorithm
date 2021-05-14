package Group4;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Test10 {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        Test10 test10 = new Test10();
        int i = test10.lastStoneWeight(stones);
        System.out.println(i);
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones)
            pq.offer(stone);
        int distant = 0;
        while (pq.size() > 1)
            if ((distant = pq.poll() - pq.poll()) > 0)
                pq.offer(distant);
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
