package Contest.contest2;

public class Test3 {
    public static void main(String[] args) {
        String word1 = "uuurruuuruuuuuuuuruuuuu", word2 = "urrrurrrrrrrruurrrurrrurrrrruu";
        Test3 test3 = new Test3();
        String s = test3.largestMerge(word1, word2);
        System.out.println(s);
    }

    public String largestMerge(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int temp1 = 0;
        int temp2 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (temp1 < length1 && temp2 < length2) {
            if (word1.charAt(temp1) > word2.charAt(temp2)) {
                stringBuilder.append(word1.charAt(temp1));
                temp1++;
                continue;
            } else if (word1.charAt(temp1) < word2.charAt(temp2)) {
                stringBuilder.append(word2.charAt(temp2));
                temp2++;
                continue;
            }
            int k = 0;
            while (word1.charAt(temp1 + k) == word2.charAt(temp2 + k)) {
                k++;
                if (temp1 + k == length1 || temp2 + k == length2) {
                    k -= 1;
                    break;
                }
            }
            if (word1.charAt(temp1 + k) > word2.charAt(temp2 + k)) {
                for (int i = 0; i <= k; i++) {
                    stringBuilder.append(word1.charAt(temp1 + i));
                }
                temp1 += k + 1;
            } else {
                for (int i = 0; i <= k; i++) {
                    stringBuilder.append(word2.charAt(temp2 + i));
                }
                temp2 += k + 1;
            }
        }
        if (temp1 == length1 && temp2 < length2) {
            for (int i = temp2; i < length2; i++) {
                stringBuilder.append(word2.charAt(i));
            }
        } else if (temp2 == length2 && temp1 < length1) {
            for (int i = temp1; i < length1; i++) {
                stringBuilder.append(word1.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

}
