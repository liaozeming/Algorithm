package Contest.contest1;

public class Test3 {
    public static void main(String[] args) {
        String s = "cabaabac";
        Test3 test3 = new Test3();
        int i = test3.minimumLength(s);
        System.out.println(i);
    }

    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char c = s.charAt(left);
            while (left < right && c == s.charAt(left)) {
                left++;
            }
            while (left - 1 < right && c == s.charAt(right)) {
                right--;
            }
        }
        return right - left + 1;
    }
}
