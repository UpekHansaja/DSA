# DSA (Data Structures and Algorithms)

- Empowering developers with Essential Data Skills for Efficient Problem Solving.

![DSA - Data Structures and Algorithms](./res/img/undraw_algorithm-execution_rksm.svg)

## What is Data Structures?

Data structures are fundamental constructs used in software engineering to organize and manage data efficiently. They provide a way to store and manipulate data so that operations like searching, sorting, inserting, and deleting can be performed quickly and effectively.

_Data Structures are used to organize and store data to use it in an effective way when performing data operations._


*Note:*
Depending on your requirement and project, it is important to choose the right data structure for your project.

## What is Algorithm?

Algorithms are step-by-step procedures or sets of rules followed to solve problems or accomplish specific tasks. In software engineering, algorithms are essential for performing computations, data processing, and automated reasoning. They serve as the backbone for computer programs, determining how data is processed, manipulated, and transformed.

Algorithm is a set of well-defined instructions to solve a particular problem. It takes a set of input(s) and produces the desired output.

### Example 1:
An algorithm to add two numbers:
 1. Take two numbers as input.
 2. Add numbers using the addition operator (+).
 3. Display the result.


### Qualities of a good Algorithm:

Here are some essential qualities that define a good algorithm:

 - Input & Output should be defined precisely.
 - Each step in the algorithm should be clear and unambiguous.
 - Algorithm should be most effective among many different ways to solve a problem.
 - An algorithm shouldn't include computer code. Instead, the algorithm should be written in such a way that it can be used in different programming languages.


### Key Characteristics of Algorithms include:

```plaintext

+-----------------+-------------------------------------------------------------------+
| Input           | Algorithms take zero or more inputs. These inputs can be numbers, | 
|                 | strings, arrays, or any other data type relevant to the problem   |
|                 | being solved.                                                     |
+-----------------+-------------------------------------------------------------------+
| Output          | Algorithms produce one or more outputs based on the input and the |
|                 | steps performed. The output could be a result, a modified input,  |
|                 | or simply a signal indicating completion of a task.               |
+-----------------+-------------------------------------------------------------------+
| Definiteness    | Algorithms are precise and unambiguous, with each step clearly    |
|                 | defined and executable. This ensures that the algorithm can be    |
|                 | followed exactly and consistently to produce the desired outcome. |
+-----------------+-------------------------------------------------------------------+
| Finiteness      | Algorithms must terminate after a finite number of steps. They    |
|                 | cannot run indefinitely, ensuring that the problem-solving        |
|                 | process eventually reaches a conclusion.                          |
+-----------------+-------------------------------------------------------------------+
| Effectiveness   | Algorithms must be effective in solving the problem they are      |
|                 | designed for. This means they should correctly solve the problem, |
|                 | preferably in an efficient manner, within reasonable time and     |
|                 | resource constraints.                                             |
+-----------------+-------------------------------------------------------------------+


```

### Example 2:

Find the largest number among three numbers:

```plaintext

1. Start
2. Input three numbers: A, B, C
3. Initialize a variable 'largest'.
4. Compare with first two numbers A and B:
    - If A > B, then assign largest = A
    - Otherwise, assign largest = B
5. Compare largest with the third number C:
    - If C > largest, then assign largest = C
6. Output the value of largest
7. End.

```

### Efficiency of Algorithms:

 - [Time Complexity](./TimeComplexity/):
     - Amount of time required for an execution.

 - [Space Complexity](./SpaceComplexity/):
     - Amount of memory space required when it runs.


***


## Data Structures and Types

Data Types can be classified into two categories:

 - Primitive Data Types
 - Non-Primitive Data Types

### Primitive Data Types

The primitive data structure, also referred to as built-in data types, can only store data of a single type. This includes integers, floating points, characters, and similar types.

Examples of primitive data types include:
 - int
 - float
 - char
 - boolean
 - double
 - byte
 - short
 - long

### Non-Primitive Data Types

Non-primitive data structure, unlike their primitive counterparts, can store data of multiple types. Examples include arrays, linked lists, stacks, queues, trees, and graphs. These are often termed derived data types.

Examples of non-primitive data types include:
 - Arrays
 - Strings
 - Classes
 - Interfaces
 - Lists
 - Stacks
 - Queues
 - Trees
 - Maps


```plaintext

                                    Data Structure
                                           | 
           +-------------------------------+-------------------------------+
           |                                                               |
    Primitive Data Types                                       Non-Primitive Data Types
           |                                                               |
           |-- int                            +----------------------------+------------------------+
           |-- char                           |                                                     |
           |-- float                        Linear                                               Non-Linear
           |-- bool                           |                                                     |
           |-- long                     +-----+-----+                                       +-------+-------+
           |-- short                    |           |                                       |               |
           |-- pointer                Static      Dynamic                                 Tree            Graph
           |-- double                   |           |                                                      
           +-- byte                   Arrays        |-- Linked List 
                                                    |-- Stack
                                                    +-- Queue

```


```plaintext

                        Linear                                    Non-Linear
                                               |         
                                               |
                    |       |                  |                       (1)
                    |-------|                  |                      /   \
                    |   C   |                  |                     /     \
                    |-------|                  |                   (2)      (4)
                    |   B   |                  |                  /   \ 
                    |-------|                  |                 /     \
                    |   A   |                  |               (3)      (5)
                    +-------+                  |              
                                               |
                                               |
        ------------------------------         |                   (1)
           4  |  2  |  3  |  5  |  6           |                  /   \
        ------------------------------         |                 /     \
                                               |               (2)-----(3)
                                               |
                                               |
        +-----+-----+-----+-----+-----+        |                          (1)
        |  1  |  3  |  5  |  7  |  9  |        |                         /
        +-----+-----+-----+-----+-----+        |                        /
                                               |                      (2)
                                               |                     
                                               |                    


```


### Linear Data Structures

A Linear Data Structure maintains a straight-line connection between its data elements, where each element is linked to its predecessors and successors, except for the first and last elements. However, the physical arrangement in memory may not follow this linear sequence.

Examples of Linear Data Structures include:
 - [Arrays](./DataStructures/Linear/Array/)
 - Linked Lists
 - [Stacks](./DataStructures/Linear/Stack/)
 - [Queues](./DataStructures/Linear/Queue/)

Linear data structures are categorized into two types based on their memory allocation:

 - Static Data Structures
 - Dynamic Data Structures


#### Static Data Structures

Static Data Structures have a predetermined size allocated during compilation, and users cannot alter this size after compilation. However, the data stored within these structures can be modified.

#### Dynamic Data Structures

Dynamic Data Structures are those whose size can change during runtime, with memory allocated as needed. Users can modify both the size and the data elements stored within these structures while the code is executing.


### Non-Linear Data Structures

Non-linear data structures store data hierarchically, allowing it to exist at multiple levels and making traversal more complex than in linear data structures.

They address the limitations of linear data structures, such as inefficient memory allocation.

In linear structures, each element occupies an entire memory block, potentially wasting space if the element doesn't fully utilize the block.

Non-linear data structures optimize memory usage, reducing space complexity.


