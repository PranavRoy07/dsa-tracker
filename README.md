# Java DSA Pattern Tracker

Interview-prep repo for the TCS / Cognizant / Markytics SDE pipeline. 30 problems across 3 patterns groups, each with brute-force (commented) + optimised solutions, JUnit 5 tests, and complexity annotations in every file header.

## Structure
```
src/main/java/patterns/
  arrays/      10 problems — Two Pointer, Sliding Window, Kadane's, Prefix/Suffix
  linkedlist/  3 problems  — Pointer manipulation, Floyd's cycle detection
  trees/       7 problems  — BFS, DFS, BST properties
  strings/     10 problems — HashMap, Stack

src/test/java/patterns/   — one JUnit 5 test class per solution
PATTERNS.md                — pattern summary: definition, signal, template, 2 example problems
```

## Requirements
- JDK 17+ (project targets 17; tested here on 21, which is backward compatible)
- Maven 3.6+

**On this "no installation" constraint:** a real, compilable, testable Java/Maven project cannot run from a browser with zero installation — `javac`/JUnit need a JDK on the machine, that's non-negotiable for actual code execution. What *can* be installation-free is a companion **read-only HTML dashboard** (see below) that shows the pattern tracker, problem list, and progress — that opens directly in any browser, no server, no install. If the "web server, no install" requirement is strict, treat this repo as what you push to GitHub / hand to your TL, and the dashboard as what you demo. Flag this to your TL if the constraint was meant literally — worth 30 seconds to avoid a surprise.

## Running locally (Windows, PowerShell or CMD)
```
cd dsa-tracker
mvn test
```
This compiles everything and runs all JUnit 5 tests with a pass/fail summary.

To run a single test class:
```
mvn test -Dtest=TwoSumTest
```

## Verified
All 30 solutions compile and all 75 JUnit tests pass (verified in a clean sandbox with `javac` + the JUnit 5 console launcher — Maven Central wasn't reachable there, but the `pom.xml` is standard and will resolve normally on a machine with internet access).

## Mentorship challenge (from the roadmap)
After each pattern batch: close the IDE, open a blank file, rewrite the optimal solution from memory. Target: a working HashMap solution in under 8 minutes — that's the TCS CodeVita clock.
