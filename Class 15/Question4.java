
//  **Question 4**

// You are given a stack **St**. You have to reverse the stack using recursion.


import java.util.Stack;

public class Question4 {
    public static void insertAtBottom(Stack<Integer> s, int item)
    {
        if (s.empty())
        {
            s.push(item);
            return;
        }
 
        int top = s.pop();
        insertAtBottom(s, item);
 
        
        s.push(top);
    }
 
    public static void reverseStack(Stack<Integer> s)
    {
        if (s.empty()) {
            return;
        }
 
        int item = s.pop();
        reverseStack(s);
 
        insertAtBottom(s, item);
    }
 
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(7);
        s.push(6);
 
        
        reverseStack(s);
        System.out.println(s);
    }
}
