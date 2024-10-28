package jplsemfive.exp5.stack;

public class StackImpl implements Stack {
    private int[] stack;
    private int top;
    private int maxSize;

    public StackImpl(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    @Override
    public void push(int element) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return; 
        }
        stack[++top] = element;
    }

    @Override
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    @Override
    public int peek() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return -1;
        }
        return stack[top];
    }
}
