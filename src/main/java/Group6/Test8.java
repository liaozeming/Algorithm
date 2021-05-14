package Group6;

public class Test8 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 2};
        int n = 5, k = 3;
        Test8 test8 = new Test8();
        int kth = test8.findKth(a, n, k);
        System.out.println(kth);
    }

    public int findKth(int[] a, int n, int K) {
        // write code here
        int low = 0;
        int high = a.length - 1;
        quickSort(a, low, high);
        return a[K - 1];
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low > high) {
            return;
        }
        int i = low;
        int j = high;
        int key = a[low];
        while (i < j) {
            //从右往左找第一个小于key的数
            while (i < j && a[j] > key) {
                j--;
            }
            //从左到右找第一个大于key的数
            while (i < j && a[i] <= key) {
                i++;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int p = a[i];
        a[i] = a[low];
        a[low] = p;

        quickSort(a, low, i - 1);
        quickSort(a, i + 1, high);

    }
}
