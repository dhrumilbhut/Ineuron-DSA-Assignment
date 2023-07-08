
//  **Question 1**

// Given an array **arr[ ]** of size **N** having elements, the task is to find the next greater element for each element of the array in order of their appearance in the array.Next greater element of an element in the array is the nearest element on the right which is greater than the current element.If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.


public class Question1 {
    static void nextGreaterElement(int a[], int n) {
		int nextGreater = -1;

		for (int i=0; i<n; i++)
		{
			nextGreater = -1;
			for (int j = i+1; j<n; j++) {
                
				if (a[i] < a[j]) {
					nextGreater = a[j];
					break;
				}
			}
			System.out.println(nextGreater);
		}
	}
	
	public static void main(String args[]) {

		int a[]= {1,3,2,4};
		int n = 4;

		nextGreaterElement(a, n);
	}
}