package Group4;

import java.util.Stack;

public class Test4 {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        Test4 test4 = new Test4();
        String s1 = test4.removeDuplicateLetters(s);
        System.out.println(s1);
    }

    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (stack.contains(c))
                continue;
            while (!stack.isEmpty() && stack.peek() > c && s.indexOf(stack.peek(), i) != -1)
                stack.pop();
            stack.push(c);
        }
        char chars[] = new char[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            chars[i] = stack.get(i);
        }
        return new String(chars);
    }
}
