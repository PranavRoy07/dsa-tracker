# Pattern Summary — Java DSA Pattern Tracker

Each entry: what the pattern is, the signal that tells you to reach for it, a Java skeleton, and two problems from this repo that use it.

---

## 1. HashMap (lookup / frequency)
**Definition:** Trade space for O(1) average lookups instead of re-scanning data.
**Recognition signal:** "Have I seen this before?", "count occurrences", "find a complement/pair", anagram or frequency questions.
**Template:**
```java
Map<Integer, Integer> seen = new HashMap<>();
for (int x : arr) {
    if (seen.containsKey(target - x)) { /* found pair */ }
    seen.put(x, seen.getOrDefault(x, 0) + 1);
}
```
**Problems:** `TwoSum`, `GroupAnagrams`

## 2. Two Pointer
**Definition:** Two indices moving through a (usually sorted) structure toward or away from each other to avoid nested loops.
**Recognition signal:** Sorted array, "pair/triplet that sums to X", "container/area between two walls".
**Template:**
```java
int left = 0, right = arr.length - 1;
while (left < right) {
    // evaluate arr[left], arr[right]
    if (/* need bigger */) left++; else right--;
}
```
**Problems:** `ThreeSum`, `ContainerWithMostWater`

## 3. Sliding Window
**Definition:** A two-pointer variant where the window only grows/shrinks contiguously, tracking a running state.
**Recognition signal:** "Longest/shortest substring/subarray with property X", contiguous subsequence.
**Template:**
```java
int left = 0;
for (int right = 0; right < arr.length; right++) {
    // expand window with arr[right]
    while (/* window invalid */) {
        // shrink window from the left
        left++;
    }
    // update best answer using window [left, right]
}
```
**Problems:** `LongestSubstringWithoutRepeating`, `MinimumWindowSubstring`

## 4. Prefix / Suffix Product or Sum
**Definition:** Precompute running totals from both directions so any range query becomes O(1).
**Recognition signal:** "Without using division", "product/sum of everything except index i".
**Template:**
```java
int[] prefix = new int[n]; prefix[0] = 1;
for (int i = 1; i < n; i++) prefix[i] = prefix[i-1] * nums[i-1];
int suffix = 1;
for (int i = n-1; i >= 0; i--) { result[i] = prefix[i] * suffix; suffix *= nums[i]; }
```
**Problems:** `ProductExceptSelf`

## 5. Kadane's (running-sum DP)
**Definition:** At each index decide: extend the current run, or start fresh — the simplest 1D dynamic programming pattern.
**Recognition signal:** "Maximum/minimum subarray sum", contiguous run optimization.
**Template:**
```java
int current = nums[0], best = nums[0];
for (int i = 1; i < nums.length; i++) {
    current = Math.max(nums[i], current + nums[i]);
    best = Math.max(best, current);
}
```
**Problems:** `MaximumSubarray`

## 6. BFS / DFS (recursive + iterative)
**Definition:** Systematic traversal of trees/graphs — BFS level by level with a queue, DFS depth-first with recursion or a stack.
**Recognition signal:** "Level order", "shortest path in unweighted graph" → BFS. "Explore all paths", "is valid/symmetric/inverted" → DFS.
**Template (BFS):**
```java
Queue<TreeNode> queue = new ArrayDeque<>();
queue.add(root);
while (!queue.isEmpty()) {
    TreeNode node = queue.poll();
    if (node.left != null) queue.add(node.left);
    if (node.right != null) queue.add(node.right);
}
```
**Problems:** `LevelOrderBFS` (BFS), `InvertTree` / `SymmetricTree` (DFS)

## 7. Floyd's Cycle Detection (fast/slow pointers)
**Definition:** Two pointers moving at different speeds through a linked structure; if there's a cycle, they must eventually meet.
**Recognition signal:** Linked list cycle questions, "detect a loop", "find the duplicate number" (array-as-linked-list).
**Template:**
```java
ListNode slow = head, fast = head;
while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) return true; // cycle found
}
```
**Problems:** `DetectCycle`

## 8. Stack (matching / nested structure)
**Definition:** LIFO structure for problems with nested or matching structure — push on "open", resolve on "close".
**Recognition signal:** Brackets, nested encodings, "undo the last operation".
**Template:**
```java
Deque<Character> stack = new ArrayDeque<>();
for (char c : s.toCharArray()) {
    if (isOpening(c)) stack.push(c);
    else { /* pop and validate/resolve */ }
}
```
**Problems:** `DecodeString`

---

### Non-pattern reminder baked into this repo
`StringBuilderDemo` isn't a traversal pattern — it's a discipline reminder: **never concatenate Strings with `+=` inside a loop.** Strings are immutable in Java, so each `+=` allocates a brand-new String (O(n) per append, O(n²) total). Use `StringBuilder.append()` instead (O(1) amortised per append). Interviewers notice this instantly.
