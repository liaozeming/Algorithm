package Work1;

import java.util.ArrayList;
import java.util.List;

public class Work2 {
    public static void main(String[] args) {
        List<Integer> list=getSpecialNum();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static List<Integer> getSpecialNum() {
        List<Integer> list=new ArrayList<>();
        for (int i = 100; i <1000 ; i++) {
            if (IsSpecial(i))
            {
                list.add(i);
            }
        }
        return list;
    }

    private static boolean IsSpecial(int i) {
        //得到百位
        int bai=i/100;
        //得到十位
        int shi=(i-bai*100)/10;
        //得到个位
        int ge=i%10;
        return (ge+bai)==shi;
    }
}
