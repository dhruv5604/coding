# Maximum Average Subarray of Size K

## Problem Statement

You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is exactly k that has the maximum average value and return this value.

---

## Example

Input:
nums = [1, 12, -5, -6, 50, 3]
k = 4

Output:
12.75

Explanation:
Subarray [12, -5, -6, 50] has the maximum average.

---

## Brute Force Solution

### Idea

Check the average of every possible contiguous subarray of size k and return the maximum.

### Algorithm

* Loop from index 0 to n - k
* For each index:
  * Calculate sum of k elements
  * Compute average = sum / k
  * Update maximum average

### Problems with Brute Force

* Recalculates overlapping subarray sums
* Inefficient for large arrays

### Time and Space Complexity

* Time: O(n * k)
* Space: O(1)

---

## Why Use Sliding Window?

* The subarray length is fixed (k)
* Data is continuous
* Overlapping computations can be reused
* Perfect case for fixed-size sliding window

---

## Optimal Solution: Sliding Window

### Idea

Maintain a window of size k and slide it forward while reusing the previous sum.

### Algorithm

* Calculate sum of first k elements
* Set maxAvg = windowSum / k
* For each next element:
  * Add new element to window
  * Remove outgoing element from window
  * Update maxAvg

### Time and Space Complexity

* Time: O(n)
* Space: O(1)

---

## Key Learning

* Fixed-size window problems should always be solved with Sliding Window.
* Sliding Window avoids recomputation.
* Improves performance from O(n*k) to O(n).
