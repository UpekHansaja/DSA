public class QueueExample {

    private int[] queueArray;
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;

    public QueueExample(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public void enqueue(int value) {

        if (!isFull()) {
            rear++;
            queueArray[rear] = value;
            nItems++;
            System.out.println("Insert " + value + " to the queue");
        } else {
            System.out.println("Queue is full : Cannot insert " + value);
        }

    }

    public void dequeue() {

        if(!isEmpty()){
            int temp = queueArray[front];
            front++;
            nItems--;
            System.out.println("Remove " + temp + " from the queue");
        } else {
            System.out.println("Queue is empty : Nothing to remove");
        }

    }

    public static void main(String[] args) {
        
        QueueExample queue = new QueueExample(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.enqueue(60); // Queue is full

        System.out.println("");
        System.out.println("Number of items in the queue: " + queue.nItems);
        System.out.println("Size of the queue: " + queue.maxSize);
        System.out.println("");
        
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        
        queue.dequeue(); // Queue is empty
        
        System.out.println("");
        System.out.println("Number of items in the queue: " + queue.nItems);
        System.out.println("Size of the queue: " + queue.maxSize);

    }

}
