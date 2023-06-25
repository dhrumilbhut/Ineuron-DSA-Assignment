class Stack {
    private int maxSize;
    private int top; 
    private int[] stackArray;

    // Constructor
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.stackArray = new int[maxSize];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Push an element onto the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = element;
        System.out.println("Pushed element: " + element);
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        int poppedElement = stackArray[top--];
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }
}

public class q1{

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());
}
}

