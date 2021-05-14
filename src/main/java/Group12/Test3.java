package Group12;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test3 {
    public static void main(String[] args) {
        String S = "abbbabaaa";
        Test3 test3 = new Test3();
        String s = test3.removeDuplicates(S);
        System.out.println(s);
    }

    public String removeDuplicates(String S) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] cs = S.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (stack.isEmpty() || stack.peek() != cs[i]) {
                stack.push(cs[i]);
            } else if (stack.peek() == cs[i]) {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
//            sb.insert(0,stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
