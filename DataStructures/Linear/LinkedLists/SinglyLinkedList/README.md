# Singly Linked List

A singly linked list is a type of linked list where each node contains data and a pointer to the next node in the sequence. The last node points to null, indicating the end of the list. This structure allows for efficient insertion and deletion of nodes, especially at the beginning of the list.


### Operation in a Singly Linked List

**Insertion at the End:**

    - Create a new node with the given data.
    - If the list is empty, make the new node the head.
    - Otherwise, traverse to the last node.
    - Set the last node's next pointer to the new node.

**Insertion at the Beginning:**

    - Create a new node with the given data.
    - Set the new node's next to the current head.
    - Update the head to be the new node.

