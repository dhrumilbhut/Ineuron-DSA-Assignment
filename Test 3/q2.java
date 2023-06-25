 class Queue {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node front; // Front of the queue
    private Node rear; // Rear of the queue

    // Constructor
    public Queue() {
        front = null;
        rear = null;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (front == null);
    }

    // Enqueue an element into the queue
    public void enqueue(int element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued element: " + element);
    }

    // Dequeue an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int dequeuedElement = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println("Dequeued element: " + dequeuedElement);
        return dequeuedElement;
    }

   
    
}

public class q2 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Is queue empty? " + queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Is queue empty? " + queue.isEmpty());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}