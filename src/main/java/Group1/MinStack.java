package Group1;

import java.util.Stack;

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int data) {
        val = data;
    }
};

public class MinStack {
    Stack<Integer> A, B;

    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.add(x);
        if (B.empty() || B.peek() >= x)
            B.add(x);
    }

    public void pop() {
        if (A.pop().equals(B.peek()))
            B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }

}
