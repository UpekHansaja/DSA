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

    public void removeByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index: " + index);
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
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

        arr.removeByIndex(2); // Removing element at index 2 (which is 30)
        System.out.println("After removing element at index 2:");
        arr.display(); // Output: 10 20 40 50
    }
}