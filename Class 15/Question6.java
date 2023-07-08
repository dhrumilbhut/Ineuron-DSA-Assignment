
//  **Question 6**

// Given string **S** representing a postfix expression, the task is to evaluate the expression and find the final value. Operators will only include the basic arithmetic operators like ***, /, + and -**.


import java.util.Stack;

public class Question6 {
     public static int evalPostfix(String exp)
    {
        if (exp == null || exp.length() == 0) {
            System.exit(-1);
        }
 
        Stack<Integer> stack = new Stack<>();
 
        for (char c: exp.toCharArray())
        {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            }
            else {
                int x = stack.pop();
                int y = stack.pop();
 
              
                if (c == '+') {
                    stack.push(y + x);
                }
                else if (c == '-') {
                    stack.push(y - x);
                }
                else if (c == '*') {
                    stack.push(y * x);
                }
                else if (c == '/') {
                    stack.push(y / x);
                }
            }
        }
 
      
        return stack.pop();
    }
 
    public static void main(String[] args)
    {
        String exp = "231*+9-";
        System.out.println(evalPostfix(exp));
    }
}
