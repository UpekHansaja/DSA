public class CircularQueue {

    private int[] array;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if (!isFull()) {
            rear = (rear + 1) % capacity;
            array[rear] = value;
            size++;
        } else {
            System.out.println("Queue is full. Cannot enqueue " + value);
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int value = array[front];
            front = (front + 1) % capacity;
            size--;
            return value;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Indicating that the queue is empty
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return array[front];
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Indicating that the queue is empty
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.peek()); // Output: 10
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 10
        System.out.println("Front element after dequeue: " + queue.peek()); // Output: 20
        System.out.println("Current size: " + queue.size()); // Output: 2

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70); // This should indicate that the queue is full

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        queue.dequeue(); // This should indicate that the queue is empty

    }

}
