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
                 ✅                        |                       ❌  
                                           |

```


## Perfect Binary Tree

A perfect binary tree is a type of binary tree in which every internal node has exactly two child nodes and all leaf nodes are at the same level.


                    Leaf Nodes Count = Internal Nodes Count + 1

                                L    =    I + 1


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
                 ✅                        |                       ❌  
                                           |

```


## Complete Binary Tree

A complete binary tree is just like a full binary tree, but with two major differences:
    - Every level must be completely filled
    - All the leaf nodes must lean towards the left side. The last leaf node might not have a right sibling.


```plaintext

    This is a Complete Binary Tree         |    This is a Complete Binary Tree         |        This is not a Complete Binary Tree          
                                           |                                           |
                (1)                        |                (1)                        |                    
               /   \                       |               /   \                       |                      (1)                      
              /     \                      |              /     \                      |                     /   \
            (2)     (3)                    |            (2)     (3)                    |                    /     \  
           / \      /  \                   |           / \      /                      |                  (2)     (3)                  
          /   \    /    \                  |          /   \    /                       |                 /  \       \
        (4)   (5)(6)    (7)                |        (4)   (5)(6)                       |               (4)  (5)      (7)
                                           |                                           |
                                           |                                           |
                 ✅                        |                 ✅                        |                       ❌  
                                           |                                           |

```

## Degenerate (Pathological) Tree

A degenerate tree or pathological tree is a tree which having a single child either left or right. It behaves like a linked list.

```plaintext


                        (1)                        
                        /          
                       /          
                     (2)          
                       \          
                        \         
                        (3)       
                          \
                           \
                           (4)


```

## Skewed Tree

A skewed tree is a type of binary tree where all the nodes have only one child. It can be either left-skewed (all nodes have only left children) or right-skewed (all nodes have only right children).

```plaintext

        This is a Left Skewed Tree            |        This is a Right Skewed Tree          
                                              |
                        (1)                   |                (1)                      
                       /                      |                  \
                      /                       |                   \
                    (2)                       |                   (2)
                   /                          |                      \
                  /                           |                       \      
                (3)                           |                       (3)
               /                              |                         \
              /                               |                          \
            (4)                               |                          (4)
                                              |

```