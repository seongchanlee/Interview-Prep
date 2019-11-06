# Stack

## Description
* Uses **FIFO (First In First Out)** principle
* **enqueue()** to add & **dequeue()** to remove

## Application
* Used for search mechanisms like Depth-First Search (DFS) and Breadth-First Search (BFS)
* When a resource is shared among multiple consumers (e.g., CPU scheduling, disk scheduling)
* When a data is transferred asynchronously between two processes (e.g., IO buffers, pipes, file IO)

## Implementation

```Java
class ArrayQueue {
  int front, back, size;
  int capacity;
  int array[];

  public ArrayQueue(int capacity) {
    this.capacity = capacity;
    front = this.size = 0;
    rear = capacity - 1;
    array = new int[this.capacity];
  }

  void enqueue(int item) {
    this.rear = (this.rear + 1) % this.capacity;
    this.array[this.rear] = item;
    this.size = this.size + 1;
  }

  int dequeue() {
    int item = this.array[this.front];
    this.front = (this.front + 1) % this.capacity;
    this.size = this.size - 1;
    return item;
  }
} 
```