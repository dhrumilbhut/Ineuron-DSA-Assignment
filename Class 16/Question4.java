
// **Question 4**

// Given a Queue consisting of first **n** natural numbers (in random order). The task is to check whether the given Queue elements can be arranged in increasing order in another Queue using a stack. The operation allowed are:

// 1. Push and pop elements from the stack
// 2. Pop (Or Dequeue) from the given Queue.
// 3. Push (Or Enqueue) in the another Queue.


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question4 {
    static Queue<Integer> q =
                    new LinkedList<Integer>();
     
   
    static boolean checkSorted(int n)
    {
        Stack<Integer> st =
                    new Stack<Integer>();
        int expected = 1;
        int fnt;
     
      
        while (q.size() != 0)
        {
            fnt = q.peek();
            q.poll();
     
            
            if (fnt == expected)
                expected++;
     
            else
            {
                
                if (st.size() == 0)
                {
                    st.push(fnt);
                }
     
                
                else if (st.size() != 0 &&
                         st.peek() < fnt)
                {
                    return false;
                }
     
                else
                    st.push(fnt);
            }
     
           
            while (st.size() != 0 &&
                   st.peek() == expected)
            {
                st.pop();
                expected++;
            }
        }
         
       
        if (expected - 1 == n &&
                st.size() == 0)
            return true;
     
        return false;
    }
     
    public static void main(String args[])
    {
        q.add(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
     
        int n = q.size();
 
        if (checkSorted(n))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
