class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackExample {

    private Node top;
    private int size;

    public StackExample() {
        this.top = null;
    }

    public void push(int value) {

        Node temp = new Node(value);
        temp.next = this.top;
        this.top = temp;
        this.size++;
    }

    public int pop() {

        if (top != null) {
            Node temp = this.top;
            this.top = this.top.next;

            int val = temp.data;
            temp = null;
            this.size--;
            return val;
        } else {
            return -1;
        }

    }

    public int peek(){

        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    public static void main(String[] args) {
        StackExample stack = new StackExample();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Peek: " + stack.peek()); // 40
        System.out.println("Pop: " + stack.pop());  // 40
        System.out.println("Pop: " + stack.pop());  // 30
        System.out.println("Peek: " + stack.peek()); // 20
    }

}