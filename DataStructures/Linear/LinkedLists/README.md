# Linked Lists Data Structure


![Linked List](../../../res/img/young-women-group-standing-camp.png)


A linked list is a linear data structure that includes a series of connected nodes. Here, each node stores the *data* and the *address* of the next node.

Inlike arrays, linked lists allow for efficient insertion and deletion of elements because they do not require elements to be stroed in contiguous memory locations.


```plaintext


            +------+------+    +------+------+    +------+------+
    Head -> | Data | Next | -> | Data | Next | -> | Data | Next | -> NULL
            +------+------+    +------+------+    +------+------+


```

### Basic Concepts

- **Node**: The basic unit of a linked list. Each node contains:

  - *Data*: The value stored in the node.
  - *Pointer (or reference)*: The address of the next node in the sequence.

- **Head**: The first node in a linked list.

- **Tail**: The last node in a linked list, whose pointer is typically *null*.


### Types of Linked Lists

1. **[Singly Linked List](./SinglyLinkedList/)**: Each node points to the next node. The last node points to null.

2. **Doubly Linked List**: Each node has two pointers, one pointing to the next node and another pointing to the previous node.

3. **Circular Linked List**: The last node points back to the first node, forming a circle.
   -  **Singly Circular Linked List**: Only the next pointer connects to the first node.
   -  **Doubly Circular Linked List**: Both next and previous pointers connect accordingly.


### Operations on Linked Lists

- **Insertion**: Adding a new node to the list.
    - At the beginning
    - At the end
    - At a specific position

- **Deletion**: Removing a node from the list.
    - From the beginning
    - From the end
    - From a specific position

- **Traversal**: Accessing each node in the list to read or process its data.
- **Searching**: Finding a node with a specific value.
- **Reversal**: Reversing the order of nodes in the list.
