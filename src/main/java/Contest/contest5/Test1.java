package Contest.contest5;

public class Test1 {
    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        Test1 test1 = new Test1();
        String s = test1.mergeAlternately(word1, word2);
        System.out.println(s);
    }

    public String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(), word2.length());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < min; i++) {
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(i));
        }
        if (word1.length() > word2.length()) {
            stringBuilder.append(word1.substring(min, word1.length()));
        } else if (word1.length() < word2.length()) {
            stringBuilder.append(word2.substring(min, word2.length()));
        }
        return stringBuilder.toString();
    }
}
