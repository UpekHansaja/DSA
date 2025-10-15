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

**Insertion at a Specific Position:**

    - If the position is 0, insert at the beginning.
    - Otherwise, traverse to the node just before the specified position.
    - Create a new node with the given data.
    - Set the new node's next to the current node's next.
    - Set the current node's next to the new node.

**Deletion by Value:**

    - If the list is empty, return.
    - If the head node has the specified data, update the head to be the next node.
    - Otherwise, traverse the list to find the node with the specified data.
    - Update the next pointer of the previous node to skip the node with the specified data.

**Deletion by Position:**

    - If the list is empty, return.
    - If the position is 0, update the head to be the next node.
    - Otherwise, traverse to the node just before the specified position.
    - Update the next pointer of the previous node to skip the node at the specified position.

**Traversal:**

    - Start from the head node.
    - Visit each node, processing the node's data as needed.
    - Move to the next node using the next pointer.
    - Continue until the end of the list (when the next node is null).

**Search**

    - Start from the head node.
    - Traverse the list, comparing each node's data with the target data.
    - If a node with the target data is found, return true.
    - If the end of the list is reached without finding the target data, return false.

**Reverse**

    - Initialize three pointers: previous (null), current (head), and next (null).
    - Set previous to null and current to the head node.
    - Loop through the list:
        - Save the next node (next = current.next).
        - Reverse the next pointer of the current node (current.next = previous).
        - Move the previous and current one step forward (previous = current, current = next).
        - Update the head to be the previous node (the new head of the reversed list).

