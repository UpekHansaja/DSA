# Binary Tree

A Binary Tree Data Structure is a hierarchical data structure in which each node has at most two children, referred to as the left child and the right child. It is commonly used for efficient storage and retrieval of data, with various operations such as insertion, deletion, and traversal.

![Binary Tree](../../../../res/img/BinaryTree.svg)


## Full Binary Tree

A full binary tree is a special type of binary tree in which every parent node/internal node has either two or no children. Also called a `Proper Binary Tree` or `Strict Binary Tree`.

```plaintext

    This is a Full Binary Tree             |        This is not a Full Binary Tree          
       (Proper Binary Tree)                |            (Improper Binary Tree)
                                           |
                (1)                        |                    
               /   \                       |                      (1)                      
              /     \                      |                     /   \
            (2)     (3)                    |                    /     \  
            / \                            |                   /       \
           /   \                           |                 (2)       (3)                  
         (4)   (5)                         |                /  \       /
               / \                         |               /    \    (6)
              /   \                        |             (4)    (5)
            (6)   (7)                      |  
                                           |
                                           |

```


## Perfect Binary Tree

A perfect binary tree is a type of binary tree in which every internal node has exactly two child nodes and all leaf nodes are at the same level.


                    `Leaf Nodes Count` = `Internal Nodes Count` + 1

                                  `L    =    I + 1`


```plaintext

    This is a Perfect Binary Tree          |        This is not a Perfect Binary Tree          
                                           |
                (1)                        |                    
               /   \                       |                      (1)                      
              /     \                      |                     /   \
            (2)     (3)                    |                    /     \  
           / \       / \                   |                  (2)     (3)                  
          /   \     /   \                  |                 /  \     /
        (4)   (5) (6)   (7)                |               (4)  (5) (6)
                                           |
                                           |

```