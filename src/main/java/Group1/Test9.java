package Group1;

import java.util.HashSet;

//575. 分糖果
public class Test9 {
    public static void main(String[] args) {
        int[] candies = {1, 1, 2, 3};
        Test9 test9 = new Test9();
        int i = test9.distributeCandies(candies);
        System.out.println(i);
    }

    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }
        return Math.min(set.size(), candies.length / 2);
    }
}
