package Contest.contest7;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年04月18日 11:00
 */

public class Test5 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3}, arr2 = {6,5};
        Test5 test5=new Test5();
        int xorSum = test5.getXORSum(arr1, arr2);
        System.out.println(xorSum);
    }
    public int getXORSum(int[] arr1, int[] arr2) {
        int length = arr1.length;
        int length1 = arr2.length;
        long[] and=new long[length*length1];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length1; j++) {
                and[i*length1+j]=arr1[i]&arr2[j];
            }
        }
        if (and.length==1) return (int) and[0];
        int x= (int) and[0];
        for (int i = 1; i < and.length; i++) {
            x= (int) (x^and[i]);
        }
        return x;
    }

}