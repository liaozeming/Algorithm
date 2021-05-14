package Contest.contest7;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: lzm
 * @date: 2021年04月18日 10:33
 */

public class Test2 {
    public static void main(String[] args) {
        String  sentence = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        Test2 test2=new Test2();
        boolean b = test2.checkIfPangram(sentence);
        System.out.println(b);
    }

    public boolean checkIfPangram(String sentence) {
        char[] chars = sentence.toCharArray();
        if (chars.length<26) return false;
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }
         char[] chars1="abcdefghijklmnopqrstuvwxyz".toCharArray();

        System.out.println(chars1.length);
        for (int i = 0; i < chars1.length; i++) {
            if (map.get(chars1[i])==null ||map.get(chars1[i])<=0)
            {
                return false;
            }
        }
        return true;
    }

}