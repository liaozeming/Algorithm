package Group4;

public class Test5 {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        Test5 test5 = new Test5();
        int i = test5.minCostClimbingStairs(cost);
        System.out.println(i);
    }

    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        int[] minCost = new int[size];
        minCost[0] = 0;
        minCost[1] = Math.min(cost[0], cost[1]);
        for (int i = 2; i < size; i++) {
            minCost[i] = Math.min(minCost[i - 1] + cost[i], minCost[i - 2] + cost[i - 1]);
        }
        return minCost[size - 1];
    }
}
