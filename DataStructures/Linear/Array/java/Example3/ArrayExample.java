public class ArrayExample {
    private int[] array;
    private int size;
    private int capacity;

    public ArrayExample(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    public void add(int element) {
        if (size < capacity) {
            array[size] = element;
            size++;
        } else {
            System.out.println("Array is full: Cannot add " + element + " to the current array.");
            System.out.println("Resizing the array to accommodate more elements.");
            // Handle array resizing or other logic here
            capacity++;
            int[] newArray = new int[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            array[size] = element;
            size++;
        }
    }

    public int find(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i; // Element found at index i
            }
        }
        return -1; // Element not found
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayExample arr = new ArrayExample(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.println("");
        arr.display(); // Output: 10 20 30 40 50

        int index = arr.find(30);
        if (index != -1) {
            System.out.println("Element 30 found at index: " + index);
        } else {
            System.out.println("Element 30 not found in the array.");
        }

        index = arr.find(60);
        if (index != -1) {
            System.out.println("Element 60 found at index: " + index);
        } else {
            System.out.println("Element 60 not found in the array.");
        }
    }
}