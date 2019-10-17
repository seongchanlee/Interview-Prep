# Stack

## Description
* Uses LIFO (Last In First Out) principle
* **push()** to add & **pop()** to remove

## Application
* Can be used to reverse a string; String is Char[]
* "Undo" mechanisms for text editor
* Backtracking; at each checkpoint, you store all possible choices on a stack

## Implementations
Two possible implementations; using Array or LinkedList.

|          |     Array          |      LinkedList      |
|:--------:|:------------------:|:--------------------:|
| **Pros** | Easy to implement  | Dynamic sizing       | 
| **Cons** | No dynamic sizing  | Requires more memory | 

```Java
class ArrayStack {
  int MAX;
  int top;
  int[] storage;

  ArrayStack() {
    top = -1;
    storage = new int[MAX];
  }

  void push(int newElement) {
    storage[top] = newElement;
    top++;
  }

  int pop() {
    int x = storage[top];
    top--;
    return x;
  }
}
```
```Java
class LinkedListStack {
  class StackNode {
    int value;
    StackNode next;

    StackNode(int value) {
      this.value = value;
    }
  }

  StackNode root;

  void push(int newElement) {
    StackNode newNode = new StackNode(newElement);

    if (root == null) {
      root = newNode;
    } else {
      StackNode temp = root;
      root = newNode;
      newNode.next = temp;
    }
  }

  int pop() {
    int x = root.value;
    root = root.next;
    return ;
  }
}
```