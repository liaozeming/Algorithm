package Group4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            int emptyNum = Integer.valueOf(line);// 空瓶子数量
            if (emptyNum == 0) {
                break;
            }
            int drinkNum = 0;// 喝到的汽水数量
            while (emptyNum >= 3) {
                drinkNum = drinkNum + (emptyNum / 3);// 喝到的汽水数量=原数量+换到的汽水数量
                emptyNum = (emptyNum % 3) + (emptyNum / 3);// 空瓶子数量=换汽水剩下的瓶子数量+换到的汽水数量
            }
            if (emptyNum == 2) {// 剩余两个瓶子时向老板借汽水
                drinkNum++;
            }
            System.out.println(drinkNum);
        }
    }
}



