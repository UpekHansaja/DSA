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


## Array Example

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

