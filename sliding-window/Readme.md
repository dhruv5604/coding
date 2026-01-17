# Sliding Window Algorithm

## What is Sliding Window?

The Sliding Window technique is used to solve problems that deal with contiguous subarrays or substrings.

Instead of recalculating values for every possible subarray, we:

* Maintain a window over the elements
* Slide it forward by removing the left element and adding the next right element
* Reuse previous computation efficiently

This helps reduce the time complexity from O(n^2) to O(n) in many scenarios.

---

## When to Use Sliding Window?

Use this pattern when:

* The problem involves subarray or substring
* The data is continuous
* You are asked to find:
  * Maximum or Minimum sum
  * Longest or Shortest length
  * Count of valid windows
  * Substrings with constraints

---

## Types of Sliding Window

### 1. Fixed Size Window

* Window size k is constant.

Example:  
Find the maximum sum of any subarray of size k.

---

### 2. Variable Size Window

* Window size changes based on conditions.

Example:  
Longest substring without repeating characters.

---

## Time and Space Complexity

| Technique      | Time | Space        |
|----------------|------|--------------|
| Sliding Window | O(n) | O(1) or O(k) |

---

## Why Sliding Window is Important?

* Optimizes brute-force solutions
* Very common in:
  * Arrays
  * Strings
  * Two Pointer problems

---

## Example Problems

* Maximum Sum Subarray of Size K
* Longest Substring Without Repeating Characters
* Minimum Window Substring
* Subarrays with Sum = K
* Longest Subarray with At Most K Distinct Elements
