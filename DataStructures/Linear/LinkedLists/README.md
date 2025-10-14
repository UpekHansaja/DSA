# Linked Lists Data Structure

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


