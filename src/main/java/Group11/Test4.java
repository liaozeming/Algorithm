package Group11;

public class Test4 {
    public static void main(String[] args) {
        int[] customers = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy = {0, 1, 0, 1, 0, 1, 0, 1};
        int X = 3;
        Test4 test4 = new Test4();
        int i = test4.maxSatisfied(customers, grumpy, X);
        System.out.println(i);
    }

    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        //找到原始的遗留客户
        int orgin = 0;
        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) {
                orgin += customers[i];
            }
        }
        int left = 0;
        int right = X - 1;
        int changeMax = 0;
        while (right < grumpy.length) {
            //找到改变的客户量
            int change = 0;
            for (int i = left; i <= right; i++) {
                if (grumpy[i] == 1) {
                    change += customers[i];
                }
            }
            changeMax = Math.max(changeMax, change);
            left++;
            right++;
        }
        return changeMax + orgin;
    }
}
