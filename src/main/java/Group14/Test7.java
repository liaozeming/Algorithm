package Group14;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年05月09日 10:58
 */

public class Test7 {
    public static void main(String[] args) {
        int[]  nums1 = {55,30,5,4,2}, nums2 = {100,20,10,10,5};
        Test7 test7=new Test7();
        int i = test7.maxDistance(nums1, nums2);
        System.out.println(i);
    }

    public int maxDistance(int[] nums1, int[] nums2) {
        int res=0;
        for (int i = 0; i < nums1.length; i++) {
            int left=i;
            int right=nums2.length-1;
            while (left<right)
            {
                int mid=left+(right-left+1)/2;
                if (nums2[mid]>= nums1[i])
                {
                    left=mid;
                }else {
                    right=mid-1;
                }
            }
            res=Math.max(res,left-i);
        }
        return res;
    }
}