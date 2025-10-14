# Queue Data Structure

![Queue](../../../res/img/isometric-queue.svg)

A Queue is a **linear data structure** in which deletions can only occur at one end, known as the *front*, and insertions can only occur at the other end, known as the *rear*. It is similar to the real-life queue where the first person entering the queue is the first person who comes out of the queue. Therefore, queues are also called *FIFO (First In First Out)* lists.


## Basic Operations of Queue

A queue allows the following basic operations:

 - Enqueue: Add new element to the end of the queue.
 - Dequeue: Remove an element from the front of the queue.

Additionally, queue typically support auxiliary operations such as:

 - Peek: Get the value of the front of the queue without removing it. 
 - isEmpty: Checks if the queue is empty.
 - isFull: Check if the queue is full.

Every queue includes two pointers, *FRONT* and *REAR*, which indicate the position where deletion and insertion can be performed. Initially, values of *FRONT* and *REAR* is set to -1.


```plaintext


    -------------------               -------------------               -------------------        -------------------
                               ---->  |  1  |                    ---->  |  2  |  1  |                  |  2  |   |  1  | ---->
    -------------------               -------------------               -------------------        -------------------

        empty queue                         enqueue(1)                       enqueue(2)                        dequeue() -> 1


```


## Working of Queue Data Structure

The operations for managing a queue data structure are as follows:

**Initialization:**

 - Two pointers, *FRONT* and *REAR*, are used to keep track of the first and last elements in the queue, respectively.
 - When initializing the queue, set *FRONT* to *-1* and REAR to *-1*. This initial state helps in checking if the queue is empty.


**Enqueue Operation:**

 - Before adding an element, check if the queue is already full.
 - If the queue is not full, proceed as follows:
   - If the queue is empty, set *FRONT* to 0.
   - Increase the value of *REAR* by 1.
   - Place the new element in the position pointed to by *REAR*.


**Dequeue Operation:**

 - Before removing an element, check if the queue is empty.
 - If the queue is not empty, proceed as follows:
   - Return the element pointed to by *FRONT*.
   - If *FRONT* is equal to *REAR*, reset both *FRONT* and *REAR* to -1 (indicating the queue is now empty).
   - Otherwise, increase the value of *FRONT* by 1.


## Types of Queues

There are several types of queues, each with its own characteristics and use cases:

    - Simple Queue
    - Circular Queue
    - Priority Queue
    - Deque (Double-Ended Queue)


### Simple Queue

  - Linear structure where the last position is not connected to the first position.
  - Insertion occurs at the rear, and deletion at the front of the queue.
  - Once the queue is full, no more elements can be added even if there are empty spaces at the front due to deletions.
  - Also known as a Linear Queue.

The main limitation of a simple queue is that it can lead to inefficient use of memory. For example, if several elements are dequeued from the front, there may be empty spaces at the front of the queue that cannot be reused for new elements.

### Circular Queue

 - Last member is linked to the first, forming a circular structure.
 - Also known as a Ring Buffer.
 - Insertion occurs at the front, and deletion at the end of the queue.

The main advantage of a circular queue over a simple queue is better memory utilization. If the last position is full and the first position is empty, we can insert an element in the first position.
This action is not possible in a simple queue.


```plaintext

    -------------------               -------------------               -------------------        -------------------
                               ---->  |  1  |                    ---->  |  2  |  1  |                  |  2  |   |  1  | ---->
    -------------------               -------------------               -------------------        -------------------
         empty queue                       enqueue(1)                       enqueue(2)                        dequeue() -> 1
                                                                                                                |
                                                                                                                |
                                                                                                                v
    -------------------               -------------------               -------------------        -------------------
                               <----  |     |   2   |                    <----  |     |   2   |                  |     |       |   2   |
    -------------------               -------------------               -------------------        -------------------
         empty queue                       enqueue(3)                       enqueue(4)                        enqueue(5)


```

#### Working of Circular Queue Data Structure

The operations for managing a Circular Queue data structure are as follows:

**Enqueue Operation:**
 - If *(REAR + 1) % capacity == FRONT*, the queue is full
 - If the queue is empty *(FRONT == -1)*, set *FRONT* to *0*.
 - Update *REAR* to the next position in a circular manner using *(REAR + 1) % capacity*.
 - Insert the new element at the position pointed to by *REAR*.
 - Increase the *size* of the queue by *1*.

**Dequeue Operation:**
 - If *FRONT == -1*, the queue is empty.
 - Retrieve the element at the position pointed to by *FRONT*.
 - If *FRONT* equals *REAR*, reset both *FRONT* and *REAR* to *-1* to indicate that the queue is now empty.
 - Otherwise, update *FRONT* to the next position in a circular manner using *(FRONT + 1) % capacity*.
 - Decrease the *size* of the queue by *1*.


### Priority Queue

 - Nodes have predefined priorities.
 - Node with the least priority is removed first.
 - Insertion based on the order of node arrival.
 - Used in algorithms like Dijkstra's shortest path and Prim's algorithm, and in data compression techniques like Huffman coding.


Insertion occurs based on the arrival of the values and removal occurs based on priority.


```plaintext

     priority
                  +------+------+
        1  ---->  |      |   ---+---->
                  +------+------+

                  +------+------+      +------+------+      +------+------+
        2  ---->  |      |   ---+----> |      |   ---+----> |      |   ---+---->
                  +------+------+      +------+------+      +------+------+

                  +------+------+      +------+------+
        3  ---->  |      |   ---+----> |      |   ---+---->
                  +------+------+      +------+------+

```

### Deque (Double-Ended Queue)

 - Allows insertion and deletion at both front and rear ends.
 - Provides flexibility in managing data with operations from both ends.

```plaintext

             ___                                                            ___
            /   \                                                          /   \
    insertion    +-----+-----+      +-----+-----+      +-----+-----+            insertion
                 |     |  ---+----> |     |  ---+----> |     |  ---+---->
    deletion     +-----+-----+      +-----+-----+      +-----+-----+            deletion
            \___/                                                          \___/


```

#### Working of Deque Data Structure

The operations for managing a deque data structure are as follows:

 - Insertion Operations:
      - Insert at Front (push_front or addFirst): Adds an element to the front of the deque.
      - Insert at Back (push_back or addLast): Adds an element to the back of the deque.

 - Deletion Operations:
      - Remove from Front (pop_front or removeFirst): Removes and returns the element from the front of the deque.
      - Remove from Back (pop_back or removeLast): Removes and returns the element from the back of the deque.

 - Access Operations:
      - Get Front (peek_front or getFirst): Returns the element at the front of the deque without removing it.
      - Get Back (peek_back or getLast): Returns the element at the back of the deque without removing it.

 - Other Operations:
      - Size (size): Returns the number of elements currently in the deque.
      - Empty Check (isEmpty): Checks if the deque is empty.
      - Clear: Removes all elements from the deque.


