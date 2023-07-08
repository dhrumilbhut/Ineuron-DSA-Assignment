
//  **Question 2**

// Given a stack of integers, sort it in ascending order using another temporary stack.


import java.util.Stack;

public class Question2 {
    public static Stack<Integer> sortStack(Stack<Integer> input){
		
		Stack<Integer> tmpStack = new Stack<Integer>();
		while(!input.isEmpty()) {
	        int tmp = input.pop();
	        while(!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
	        	input.push(tmpStack.pop());
	        }
	        tmpStack.push(tmp);
	        
	    }
		return tmpStack;
	}
	
	public static void main(String a[]){
		
		Stack<Integer> input = new Stack<Integer>();
		input.add(34);
		input.add(3);
		input.add(31);
		input.add(98);
		input.add(92);
		input.add(23);
		System.out.println(sortStack(input));
	}
}
