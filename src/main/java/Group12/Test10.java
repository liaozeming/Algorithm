package Group12;

import java.util.HashMap;
import java.util.Map;

public class Test10 {
    public static void main(String[] args) {
        int[]  answers = {1, 1, 2};
        Test10 test10=new Test10();
        int i = test10.numRabbits(answers);
        System.out.println(i);
    }

    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < answers.length; i++) {
            map.put(answers[i],map.getOrDefault(answers[i],0)+1);
        }
        int res=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            //兔子喊得数
            int key = entry.getKey();
            //兔子的数量
            int value = entry.getValue();
            //分组数目
            int group = value / (key + 1);
            if (value%(key+1)==0)
            {
                //answers中刚好可以分完一组
                res+=group*(key+1);
            }else {
                res+=(group+1)*(key+1);
            }
        }
        return res;
    }
}
