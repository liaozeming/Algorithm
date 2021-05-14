package Group6;

//605. 种花问题
public class Test6 {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        Test6 test6 = new Test6();
        boolean b = test6.canPlaceFlowers(flowerbed, n);
        System.out.println(b);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (n <= 0) {        // 如果已经种够花了，可以提前返回true
                return true;
            }
            if (flowerbed[i] == 1) {     // 如果已经种过花了，则不能再种了
                continue;
            }
            if (i > 0 && flowerbed[i - 1] == 1) {        // 如果上一个格子已经种过花了，则当前这格不能种花
                continue;
            }
            if (i < flowerbed.length - 1 && flowerbed[i + 1] == 1) {   // 如果下一个格子已经种过花了，则当前这格不能种花
                continue;
            }
            // 可以种花了，并且记录次数
            flowerbed[i] = 1;
            n--;
        }
        return n <= 0;
    }

    public void canPlaceFlowers(int n, int m, int[] a) {
    }
}
