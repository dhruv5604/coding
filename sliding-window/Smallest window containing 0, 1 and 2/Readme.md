# Smallest Substring Containing 0, 1 and 2

## Problem Statement

Given a string consisting only of characters '0', '1', and '2', find the length of the smallest contiguous substring that contains at least one '0', one '1', and one '2'.

If no such substring exists, return -1.

---

## Example

Input:
String = "01212"

Output:
3

Explanation:
The smallest valid substring is "012", which contains all three characters.

---

## Brute Force Solution

### Idea

Generate all possible substrings and check whether each substring contains '0', '1', and '2'.

### Algorithm

* For every starting index i:
  * For every ending index j:
    * Extract the substring s[i...j]
    * Check if it contains '0', '1', and '2'
    * Track the minimum length

### Problem with Brute Force

* Recomputes overlapping substrings again and again
* Very slow for large strings

### Time and Space Complexity

* Time: O(n^3)  
  (n^2 substrings and each contains check is O(n))
* Space: O(1)

---

## Why Use Sliding Window?

* The substring is continuous.
* We only care about a valid window, not all substrings.
* Sliding Window avoids repeated scanning and reuses previous information.

---

## Optimal Solution: Sliding Window

### Idea

Maintain a window that always tries to include at least one '0', '1', and '2'.

### Algorithm

* Use two pointers: left and right
* Expand right pointer and update counts
* When all three characters are present:
  * Update the minimum length
  * Shrink from the left to find smaller valid window

### Time and Space Complexity

* Time: O(n)
* Space: O(1)  (array of size 3)

---

## Key Learning

* Brute Force checks all possibilities.
* Sliding Window processes each character at most twice.
* Best approach for minimum window type problems.
