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