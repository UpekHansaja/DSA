# Space Complexity

Space complexity refers to the amount of memory space required by an algorithm to run as a function of the length of the input. It includes both the space needed for the input data and any additional space required for variables, data structures, and function calls during execution.

![Space Complexity](../res/img/undraw_app-benchmarks_ls0m.svg)

</br>

Factors that contribute to space complexity:
 1. Input data size
 2. Data structures (arrays, lists, etc.)
 3. Recursive calls (call stack)
 4. Auxiliary / Temporary variables

### Example 1:

```plaintext

void m() {                                        void m(int i) {

    int i = 20;  <------------- 1 ------------------> i += 50;

}                                                 }

```

i = 32bit / 4 byte

Space complexity: O(1)         Order of 1

    **Constant space complexity**


### Example 2:

```plaintext

void m(int n) {

    int arr[] = new int[n];             <------------- n

    for (int i = 0; i < n; i++) {       <------------- n
        arr[i] = 10;
    }

}

```

i = 32bit / 4 byte

n = 32bit / 4 byte (number of elements in the array)

arr[] = n * 32bit / 4 byte
      = n * 4 byte
      = 4n byte

Space complexity: O(n)         Order of n

    **Linear space complexity**


### Example 3:

```plaintext

void m(int n) {

    int arr[][] = new int[n][n];         <------------- n^2

    for (int i = 0; i < arr.length; i++) {   <------------- n^2
    
        for (int j = 0; j < arr[i].length; j++) { <------------- n^2
            arr[i][j] = i + 10;
        }

    }

}

```

i = 32bit / 4 byte

n = 32bit / 4 byte (number of elements in one dimension of the 2D array)

arr[][] = n * n * 32bit / 4 byte
        = n<sup>2</sup> * 4 byte
        = 4n<sup>2</sup> byte

Space complexity: O(n<sup>2</sup>)         Order of n<sup>2</sup>

    **Quadratic space complexity**
