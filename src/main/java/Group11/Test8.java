package Group11;

public class Test8 {
    public static void main(String[] args) {
        int[] A = {6, 5, 4, 4};
        Test8 test8 = new Test8();
        boolean monotonic = test8.isMonotonic(A);
        System.out.println(monotonic);
    }

    public boolean isMonotonic(int[] A) {
        boolean res = true;
        boolean res1 = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] <= A[i + 1]) {
                continue;
            } else {
                res = false;
                break;
            }
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] >= A[i + 1]) {
                continue;
            } else {
                res1 = false;
                break;
            }
        }
        return res || res1;
    }
}
