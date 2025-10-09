import java.util.EmptyStackException;

public class StackExample {

    private int[] data;
    private int capacity, top, size;

    public StackExample(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.top = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity - 1;
    }

    public void push(int value) {

        if (!isFull()) {

            data[++top] = value;
            size++;

        } else {
            System.out.println("Stack Overflow");
            throw new StackOverflowError("Stack is full :(");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int pop() {

        if (!isEmpty()) {
            size--;
            return data[top--];
        } else {
            System.out.println("Stack Underflow");
            throw new EmptyStackException();
        }

    }

    public int peek() {

        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack is empty");
            throw new EmptyStackException();
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        
        StackExample stack = new StackExample(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        // stack.push(50);
        // stack.push(60); // Stack Overflow

        System.out.println("Top element is: " + stack.peek()); // 50
        System.out.println("Stack size is: " + stack.size()); // 5
        System.out.println("Popped element is: " + stack.pop()); // 50
        System.out.println("Stack size is: " + stack.size()); // 4
        System.out.println("Top element is: " + stack.peek()); // 40

    }

}