package Group4;

import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        int[] g = {1, 2, 3}, s = {3};
        Test8 test8 = new Test8();
        int contentChildren = test8.findContentChildren(g, s);
        System.out.println(contentChildren);
    }

    public int findContentChildren(int[] g, int[] s) {
        int child = 0;
        int cookie = 0;
        Arrays.sort(g);  //先将饼干 和 孩子所需大小都进行排序
        Arrays.sort(s);
        while (child < g.length && cookie < s.length) { //当其中一个遍历就结束
            if (g[child] <= s[cookie]) { //当用当前饼干可以满足当前孩子的需求，可以满足的孩子数量+1
                child++;
            }
            cookie++; // 饼干只可以用一次，因为饼干如果小的话，就是无法满足被抛弃，满足的话就是被用了
        }
        return child;
    }
}
