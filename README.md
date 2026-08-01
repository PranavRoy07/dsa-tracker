# Java DSA Pattern Tracker

An interview-prep repository for the TCS / Cognizant / Markytics SDE pipeline. 30 problems across 4 pattern groups — each with a brute-force approach (commented) alongside the optimised solution, JUnit 5 tests, and time/space complexity annotations in every file header. Includes a companion `dashboard.html` that opens in any browser with no installation.

---

## Structure

```
src/main/java/patterns/
  arrays/       10 problems — Two Pointer, Sliding Window, Kadane's Algorithm, Prefix/Suffix
  linkedlist/    3 problems — Pointer manipulation, Floyd's cycle detection
  trees/         7 problems — BFS level-order, DFS (pre/in/post-order), BST properties
  strings/      10 problems — HashMap frequency counting, Stack-based parsing

src/test/java/patterns/    — one JUnit 5 test class per solution file
PATTERNS.md                — pattern summary: definition, recognition signal, code template, 2 worked examples per pattern
dashboard.html             — read-only progress tracker; opens in any browser, no install needed
pom.xml                    — Maven build config (JDK 17+, JUnit 5)
```

---

## Pattern groups

### Arrays (10 problems)
Two Pointer, Sliding Window, Kadane's (max subarray), Prefix/Suffix products — the patterns that appear in TCS CodeVita, Cognizant GenC, and every array-heavy screening round.

### Linked Lists (3 problems)
Pointer manipulation (reverse, merge), Floyd's cycle detection — `fast`/`slow` pointer technique.

### Trees (7 problems)
BFS level-order traversal, DFS in all three orderings (pre/in/post), BST search and insertion, and height/depth queries.

### Strings (10 problems)
HashMap-based frequency analysis, Stack-based bracket matching and expression parsing — the patterns that show up in Markytics data engineering rounds.

---

## Engineering standards

- Every solution file has a file-header comment with the problem statement, time complexity, and space complexity
- Every problem has a brute-force approach in comments alongside the optimised solution — interviewers often ask you to derive the optimisation from the naive version
- 75 JUnit 5 tests — all pass on a clean `mvn test`
- `PATTERNS.md` is an interview cheat sheet: definition, when to recognise the pattern, a minimal code template, and two worked examples per pattern

---

## Requirements

- JDK 17+ (tested on JDK 21, backward compatible)
- Maven 3.6+ (for tests only — the app itself needs only `javac`)

---

## Running the tests

```bash
cd dsa-tracker
mvn test
```

Run a single test class:
```bash
mvn test -Dtest=TwoSumTest
```

---

## Viewing the dashboard (no install)

Open `dashboard.html` directly in any browser. It shows the pattern tracker, problem list, and progress — no server, no JDK needed.

---

## Verified

All 30 solutions compile and all 75 JUnit 5 tests pass on a clean build with JDK 17+ and Maven 3.6+.

---

## Tech stack

- Java 17+
- Maven 3.6+
- JUnit 5
- Vanilla HTML/CSS (`dashboard.html` — no framework)
