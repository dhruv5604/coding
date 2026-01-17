# Maximum Sum Subarray of Size K

## Problem Statement

Given an integer array and a number k, find the maximum sum of any contiguous subarray of size k.

Example:
Array = [2, 1, 5, 1, 3, 2]
k = 3  
Output = 9  
(Subarray [5, 1, 3])

---

## Approach 1: Brute Force

### Idea

Check the sum of every possible subarray of size k and keep track of the maximum.

### Algorithm

* Loop from index 0 to n - k
* For each index, calculate the sum of next k elements
* Update the maximum sum

### Time and Space Complexity

* Time: O(n * k)
* Space: O(1)

---

## Approach 2: Sliding Window (Optimal)

### Idea

Instead of recalculating the sum every time, maintain a window of size k and slide it forward.

### Algorithm

* Calculate the sum of the first k elements
* For each next element:
  * Add the new element to the window
  * Remove the element going out of the window
  * Update the maximum sum

### Time and Space Complexity

* Time: O(n)
* Space: O(1)

---

## Key Learning

* Brute Force recalculates overlapping subproblems.
* Sliding Window reuses previous computation.
* This pattern is very effective for fixed-size subarray problems.
