package Group9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Test11 {
    public static void main(String[] args) {
        int[] A = {0, 0, 0, 1, 0, 1, 1, 0};
        int K = 3;
        Test11 test11 = new Test11();
        int i = test11.minKBitFlips(A, K);
        System.out.println(i);
    }

    public int minKBitFlips(int[] A, int K) {
        if (A == null || A.length == 0) return 0;
        int n = A.length;

        Deque<Integer> q = new ArrayDeque<>();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            // 最左边的反转过的元素的索引，已经不在窗口内了，不能算在『当前窗口』的反转次数里面了，需要去除它。
            if (!q.isEmpty() && i - q.peekFirst() + 1 > K) q.pollFirst();

            if (q.size() % 2 == 0 && A[i] == 0 || q.size() % 2 == 1 && A[i] == 1) { // i 需要翻转的条件
                if (i + K > n) return -1;
                cnt++;        // 当前窗口翻转
                q.addLast(i); // i 加入队列，表明 i 上的数反转了一次。
            }
        }
        return cnt;
    }
}
