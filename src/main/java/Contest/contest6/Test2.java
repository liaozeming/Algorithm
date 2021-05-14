package Contest.contest6;

public class Test2 {
    public static void main(String[] args) {
        int n = 4;
        Test2 test2 = new Test2();
        int i = test2.reinitializePermutation(n);
        System.out.println(i);
    }

    public int reinitializePermutation(int n) {
        int size = 0;
        int[] orign = new int[n];
        int[] perm = new int[n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = i;
            orign[i] = i;
        }
        while (!arrsEquals(orign, perm) || size == 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    arr[i] = perm[i / 2];
                } else {
                    arr[i] = perm[n / 2 + (i - 1) / 2];
                }
            }
            perm = arr.clone();
            size++;
        }
        return size;
    }

    private boolean arrsEquals(int[] arr, int[] perm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != perm[i]) {
                return false;
            }
        }
        return true;
    }
}
