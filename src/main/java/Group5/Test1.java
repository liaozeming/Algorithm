package Group5;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int[] input = {4, 5, 1, 6, 2, 7, 3, 8};
        int k = 4;
        ArrayList<Integer> integers = test1.GetLeastNumbers_Solution(input, k);
        System.out.println(integers.toString());
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (k > input.length) {
            return null;
        }
        Arrays.sort(input);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
}
