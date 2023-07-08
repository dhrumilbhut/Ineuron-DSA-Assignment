
//  **Question 6**

// Given an integer k and a **[queue](https://www.geeksforgeeks.org/queue-data-structure/)** of integers, The task is to reverse the order of the first **k** elements of the queue, leaving the other elements in the same relative order.

// Only following standard operations are allowed on queue.

// - **enqueue(x) :** Add an item x to rear of queue
// - **dequeue() :** Remove an item from front of queue
// - **size() :** Returns number of elements in queue.
// - **front() :** Finds front item.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question6 {
    static Queue<Integer> queue;
 static void reverseQueueFirstKElements(int k)
  {
    if (queue.isEmpty() == true
      || k > queue.size())
      return;
    if (k <= 0)
      return;
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < k; i++) {
      stack.push(queue.peek());
      queue.remove();
    }
    while (!stack.empty()) {
      queue.add(stack.peek());
      stack.pop();
    }
    for (int i = 0; i < queue.size() - k; i++) {
      queue.add(queue.peek());
      queue.remove();
    }
  }
  static void Print()
  {
    while (!queue.isEmpty()) {
      System.out.print(queue.peek() + " ");
      queue.remove();
    }
  }
  public static void main(String args[])
  {
    queue = new LinkedList<Integer>();
    queue.add(2);
    queue.add(4);
    queue.add(6);
    queue.add(8);
    queue.add(10);
    
    int k = 3;
    reverseQueueFirstKElements(k);
    Print();
  }
}
