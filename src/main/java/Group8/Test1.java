package Group8;

public class Test1 {
    public static void main(String[] args) {
        int n = 5, V = 4;
        int[] a = {1, 2, 4, 4, 5};
        Test1 test1 = new Test1();
        int i = test1.upper_bound_(n, V, a);
        System.out.println(i);
    }

    public int upper_bound_(int n, int v, int[] a) {
        // write code here
        int left = 0;
        int right = n - 1;
        int mid = left + (right - left) / 2;
        while (left < right) {
            if (a[mid] < v) {
                left = mid + 1;
            } else {
                right = mid;
            }
            mid = left + (right - left) / 2;
        }
        if (a[left] < v) {
            return n + 1;
        } else {
            return left + 1;
        }
    }
}
