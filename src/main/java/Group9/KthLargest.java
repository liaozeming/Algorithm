package Group9;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {

    }

    final PriorityQueue<Integer> q;
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<Integer>(k);
        for (int i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        if (q.size() < k) {
            q.offer(val);

        } else if (q.peek() < val) {
            q.poll();
            q.offer(val);
        }
        return q.peek();
    }
}
