public class ArrayExample {

    private int[] array;
    private int size;
    private int capacity;

    public ArrayExample(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    public void addByIndex(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index: " + index);
            return;
        }
        if (size >= capacity) {
            System.out.println("Array is full: Cannot add " + element + " at index " + index);
            System.out.println("Resizing the array to accommodate more elements.");
            // Handle array resizing or other logic here
            capacity++;
            int[] newArray = new int[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayExample arr = new ArrayExample(5);
        arr.addByIndex(0, 10);
        arr.addByIndex(1, 20);
        arr.addByIndex(2, 30);
        arr.addByIndex(3, 40);
        arr.addByIndex(4, 50);

        arr.addByIndex(2, 25); // Adding 25 at index 2
        
        System.out.println("");
        arr.display(); // Output: 10 20 25 30 40 50
    }
}