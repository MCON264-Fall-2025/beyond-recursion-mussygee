Name: Chaya Goldstein 

* Part A: Fibonacchi (Recursive vs Iterative): *
(Compare recursive and iterative implementations of the Fibonacci sequence
to observe differences in time complexity and performance). 

Observations: 
- Recursive Fibonacci:
    - Runtime increases exponentially with each additional n.
    - Around n = 40-45, execution time skyrocketed to several seconds per call.
    - For n > 45, the program slows dramatically due to repeated recomputation of the same values. 
    - Complexity: O(2ⁿ) - each call spawns two more, doubling work at each leve. 
    - Demonstrates the inefficiency of recursion without memoization. 
- Iterative Fibonacci: 
    - Executed extremely fast, even for large n (up to 1000+). 
    - Time per iteration stayed nearly constant and negligible. 
    - Complexity: O(n) - each Fibonacci number is calculated in a single linear pass. 
    - Uses a constant amount of memory (a few variables), showing O(1) space. 

Conclusion: 
Recursion, while elegant, becomes exponentially slower for large inputs because of 
repeated overlapping subproblems. The iterative version is significantly more efficient and predictable,
scaling linearly with input size. 


* Part B: Linked List Insert at Tail (Recursive vs Iterative): *
(Implement inssertLast() recursively and iteratively to study time and
memory usage (stack depth)). 

Observations: 
- Recursive Insert: 
    - Each recursive call process one node, leading to linear stack growth (O(n)). 
    - For large lists (e.g., 50,000 nodes), the program crashed with a StackOverflowError. 
    - Works correctly for smaller lists (e.g., 5,000 elements), but visibly slower. 
    - Demonstrates high overhead due to deep recursion and function calls. 
- Iterative Insert: 
    - Runs almost instantly for both small and large lists. 
    - Uses only one stack frame regardless of list length (O(1) space). 
    - Much faster and safer for long lists sincce it avoids recursion entirely. 

Conclusion: 
Both methods perform the same logical operation (appending a node to the tail), but recursion
introduces unnecessary call overhead and stack consumption. The iterative version is more memory=
efficient and stable in Java, where tail-call optimization is not performed. 