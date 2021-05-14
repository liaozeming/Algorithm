package Group1;

//374. 猜数字大小
class GuessGame {

    private static final int NUM = 6;

    int guess(int num) {
        if (num == NUM) {
            return 0;
        } else if (num < NUM) {
            return -1;
        }
        return 1;
    }
}

/*    如果分支写出来是 left = mid + 1 与 right = mid 就写 int mid = left + (right - left) / 2；
        如果分支写出来是 left = mid 与 right = mid - 1 就写 int mid = left + (right - left + 1) / 2。*/
public class Test6 {
    public static void main(String[] args) {
        Test6 test6 = new Test6();
        int i = test6.guessNumber(10);
        System.out.println(i);
    }

    public int guessNumber(int n) {
        GuessGame guessGame = new GuessGame();
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (guessGame.guess(mid) == -1) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
