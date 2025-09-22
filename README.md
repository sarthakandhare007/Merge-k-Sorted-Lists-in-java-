# Merge-k-Sorted-Lists-in-java-
Problem

You are given an array of k linked-lists, each sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.


---

Example

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]


---

🔹 Intuition

Two common ways:

1. Min-Heap (Priority Queue) ✅ Optimal in practice

Push the head of each list into a min-heap.

Repeatedly pop the smallest element, and push its next node.

Build the final sorted list.


2. Divide & Conquer (Merge Sort style)

Repeatedly merge lists in pairs.

Similar to merging k arrays efficiently.



---🔹 Complexity

Time: O(N log k)

N = total number of nodes

k = number of lists


Space: O(k) (heap size)
