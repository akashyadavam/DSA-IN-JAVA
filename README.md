# Advanced Data Structures and Algorithms in Java 🚀

This repository serves as a comprehensive documentation of my journey through **Advanced Data Structures and Algorithms (DSA)** and **Object-Oriented Programming (OOP)** using Java. It contains clean, optimized, and well-commented implementations of fundamental computer science concepts.

## 📂 Repository Structure
The project is organized into modular directories, each focusing on a specific domain:

* **`LINKEDLIST`**: Custom implementations of Singly Linked Lists. Includes logic for node manipulation, memory management, and pointer-based traversal.
* **`OOPS`**: Deep dive into Object-Oriented principles. Features real-world modeling through **Inheritance**, **Classes**, and **Polymorphism**.
* **`RECURSION`**: A collection of problems solved using recursive logic, focusing on stack frames and base-case optimization.
* **`ARRAYS (1D & 2D)`**: Advanced manipulation of linear and multi-dimensional data, including matrix algorithms and search optimizations.
* **`STRINGS & SEARCHING`**: Implementations of efficient string-matching algorithms and **Binary Search** variations.

---

## 🛠️ Technical Highlights

### 1. Linked List Implementation
I have developed a custom `linkedlist` class that operates without relying on built-in libraries. This helped in mastering:
* **Manual Node Linking**: Connecting `val` and `next` pointers to create dynamic chains.
* **Edge Case Handling**: Implementing robust logic for `head` and `tail` updates during insertion and deletion.
* **Time Complexity**: Ensuring $O(1)$ operations for insertions at the head and tail.

```java
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}