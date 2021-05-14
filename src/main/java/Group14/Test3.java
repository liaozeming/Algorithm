package Group14;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月06日 9:07
 */

public class Test3 {
    public static void main(String[] args) {
        int []encoded = {6,2,7,3};
        int first=4;
        Test3 test3=new Test3();
        int[] decode = test3.decode(encoded, first);
        System.out.println(Arrays.toString(decode));
    }
    public int[] decode(int[] encoded, int first) {
        int length = encoded.length;
        int[] res=new int[length+1];
        res[0]=first;
        for (int i = 0; i < encoded.length; i++) {
            res[i+1]=encoded[i]^first;
            first=res[i+1];
        }
        return res;
    }

}