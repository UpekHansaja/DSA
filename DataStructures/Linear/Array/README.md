# Array

![Array of Small Town](../../../res/img/undraw_small-town_76a2.svg)

</br>

An array is a type of linear data structure defined as a collection of elements, which can be of the same or different data types.

Arrays can be single-dimensional or multi-dimensional. They are used when there's a need to store multiple elements of a similar nature together in one place.


```plaintext

                             +------+------+------+------+------+
    Memory Address ------->  | 2391 | 2392 | 2393 | 2394 | 2395 |
                             +------+------+------+------+------+
    Array Values   ------->  |  12  |  34  |  68  |  77  |  43  |
                             +------+------+------+------+------+
    Array Index    ------->  |  0   |  1   |  2   |  3   |  4   |
                             +------+------+------+------+------+                             

```


Arrays are commonly used to solve a wide range of problems, from simple sorting tasks to complex ones.

While many data structures offer efficient time and space complexities, arrays have a significant advantage:

```plaintext

                    O(1) random access lookup time
    
```

This means accessing any index in the array takes the same amount of time, regardless of the array's size or its position.

This efficiency is due to arrays having a pointer to the memory location and an offset value indicating the distance to look within the memory.


## Array Example 1

 Current array ----> 10, 20, 30, 40
 
 Add: 50


Algorithm:

```plaintext

 1. Start
 2. Check if the size of the array is less than the capacity. (O(1))
 3. If there's space, insert the element at the next available index. (O(1))
 4. Increment the size of the array. (O(1))
 5. End.

```

Java:

```java

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
        arr.add(60);
        arr.add(70);
        arr.add(80);
        System.out.println("");
        arr.display(); // Output: 10 20 30 40 50 60 70 80
    }
}

```


Output:

```plaintext

Array is full: Cannot add 60 to the current array.
Resizing the array to accommodate more elements.
Array is full: Cannot add 70 to the current array.
Resizing the array to accommodate more elements.
Array is full: Cannot add 80 to the current array.
Resizing the array to accommodate more elements.

10 20 30 40 50 60 70 80

```

## Array Example 2

 Add by index: 2, 25

Algorithm:

```plaintext

 1. Start
 2. Check if the index is valid and if there's space in the array. (O(1))
 3. Shift all elements from the specified index to the right by one position to make space for the new element. (O(n))
 4. Insert the new element at the specified index. (O(1))
 5. Increment the size of the array. (O(1))
 6. End.

```

Java:

```java

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

```

Output:

```plaintext

Array is full: Cannot add 25 at index 2
Resizing the array to accommodate more elements.
10 20 25 30 40 50   

```

## Array Example 3

 Find: 30, 60

Algorithm:

```plaintext

 1. Start:
 2. Iterate over each element of the array. (O(n))
 3. Compare each element with the given element. (O(1))
 4. If a match is found, return the index. (O(1))
 5. If no match is found, return -1. (O(1))
 6. End.

```

Java:

```java

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

```

Output:

```plaintext

10 20 30 40 50
Element 30 found at index: 2
Element 60 not found in the array.

```

## Array Example 4

 Remove by index: 2

Algorithm:

```plaintext

 1. Start
 2. Find the index of the element to be deleted using the Find algorithm. (O(n))
 3. If the element is found:
        - Shift all elements to the right of the index to the left by one position to fill the gap created by deleting the element. (O(n))
        - Decrement the size of the array. (O(1))
 4. End.

```

Java:

```java

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

```

Output:

```plaintext

10 20 30 40 50
After removing element at index 2:
10 20 40 50

```


## Array - Insertion Operation

In the insertion operation, one or more elements are added to the array.
Depending on the requirement, a new element can be added at the beginning, end or at any given index of the array. This is typically accomplished using input statements in programming languages.

### Insertion at the End

In an unsorted array, the insert operation is fater as compared to a sorted array because we don't have to care about the poistion at which the element is to be placed.

Time Complexity: O(1)
Space Complexity: O(1)

### Insertion at any position

Insert operations in an array at any position can be performed by shifting elements to the right, which are on the right side of the required position.

Time Complexity: O(n)
Space Complexity: O(1)


## Array - Search Operation

In an unordered array, the elements are not arranged in any particular order.
When you need to find a specific item in such an array, you typically have to check each element one by one until you find the desired item. This process is called linear traversal or linear search.

### Search operation:

In an unsorted array, the search operation is less efficient compared to a sorted array because we cannot rely on the order of elements for quicker access.

Time Complexity: O(n)
Space Complexity: O(1)


## Array - Delete Operation

During the delete operation, the element slated for removal is located via linear search, after which the deletion is executed, leading to a subsequent adjustment of the array by shifting the remaining elements.

### Delete operation:

In an unsorted array, the deletion operation can be less efficient compared to a sorted array due to the need for linear search to locate the element to be deleted, followed by the subsequent adjustment of the array by shifting the remaining elements.

Time Complexity: O(n)
Space Complexity: O(1)