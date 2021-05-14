package Group13;

import java.util.Arrays;
import java.util.Comparator;

public class Test5 {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        Test5 test5=new Test5();
        String s = test5.largestNumber(nums);
        System.out.println(s);
    }
    public String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=Integer.toString(nums[i]);
        }
        StringBuilder sb=new StringBuilder();
        //注意，这里面的加号就是对字符串类型的加法,字符串在拼接之后的大小关系决定了排序的前后
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo((o1 + o2));
            }
        });
//        Arrays.sort(str, (x, y) -> (y + x).compareTo(x + y));
        //拼接结果
        for(String s: str) sb.append(s);
        String ans = sb.toString();
        if (ans.charAt(0) == '0') {
            ans = "0";
        }
        return ans;
    }
}
