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