# Time Complexity

Time complexity is a computational complexity that describes the amount of time it takes to run an algorithm as a function of the length of the input. It provides an estimate of the efficiency of an algorithm in terms of time required for execution.

![Time Complexity](../res/img/undraw_processing_bto8.svg)

Basic operations that contribute to time complexity include:
 1. Comparisons
 2. Assignments
 3. Arithmetic operations
 4. Function / Method calls

### Example 1:

```plaintext

void m() {                                        void m(int i) {

    int i = 20;  <------------- 1 ------------------> i += 50;

}                                                 }

```

Time complexity: O(1)         Order of 1

  **Constant time complexity**

### Example 2:

```plaintext

int m(int i) {

    int x = 10;       <------------- 1
    int y = i + x;    <------------- 1
    return y;         <------------- 1

}

```

Time complexity: O(3) = O(1)         Order of 1

  **Constant time complexity**


### Example 3:

```plaintext

void m(int n) {
    for (int i = 1; i <= n; i++) {      <------------- n
        System.out.println(i);          <------------- n
    }
}

```

Time complexity: O(2n) = O(n)         Order of n

  **Linear time complexity**


### Example 4:

```plaintext

void m(int n) {
    int a = 10;
    for (int i = 1; i <= n; i++) {      <------------- n
        for (int j = 1; j <= n; j++) {  <------------- n * n
            a += 10;                    <------------- n * n
        }
    }
}

```

Time complexity: O(1 + n + n<sup>2</sup> + n<sup>2</sup>) = O(2n<sup>2</sup> + n + 1) = O(n<sup>2</sup>)         Order of n squared

  **Quadratic time complexity**


## Summary of Common Time Complexities:

If n = 10, 100, 1000:

```plaintext

+-----------------------+------------+-----------+-----------+-----------+
| Time Complexity       | Notation   | n=10      | n=100     | n=1000    |
|-----------------------|------------|-----------|-----------|-----------|
| Constant              | O(1)       | 1         | 1         | 1         |
| Linear                | O(n)       | 10        | 100       | 1000      |
| Quadratic             | O(n^2)     | 100       | 10,000    | 1,000,000 |
| Exponential           | O(2^n)     | 1024      | 1.27M     | 1.07B     |
| Logarithmic           | O(log n)   | 3.32      | 6.64      | 9.97      |
| Linearithmic          | O(n log n) | 33.2      | 664       | 9970      |
+-----------------------+------------+-----------+-----------+-----------+

```

