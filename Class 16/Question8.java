
//  **Question 8**

// Given an array of integers, the task is to find the maximum absolute difference between the nearest left and the right smaller element of every element in the array.

// **Note:** If there is no smaller element on right side or left side of any element then we take zero as the smaller element. For example for the leftmost element, the nearest smaller element on the left side is considered as 0. Similarly, for rightmost elements, the smaller element on the right side is considered as 0.


import java.util.Stack;

public class Question8 {
    static void SmallerElement(int a[], int n, int SE[]){ 
        
        Stack<Integer> S = new Stack<>(); 
  
        for(int i = 0; i < n; i++){ 
            
            while(!S.empty() && S.peek() >= a[i]){ 
                S.pop(); 
            } 
  
            if(!S.empty()){ 
                SE[i] = S.peek(); 
            }  
            
            else{ 
                SE[i] = 0; 
            } 
  
            S.push(a[i]); 
        } 
    } 
  
    static int findMaxDiff(int a[], int n){ 
        int[] left = new int[n]; 
  
        SmallerElement(a, n, left); 
  
        int[] right = new int[n]; 
        
        reverse(a); 
        SmallerElement(a, n, right); 
  
        int result = -1; 
        for(int i = 0; i < n; i++){ 
            result = Math.max(result, Math.abs(left[i] - right[n - 1 - i])); 
        } 
 
        return result; 
    } 
  
    static void reverse(int a[]){ 
        int i, k, n = a.length, t; 
        
        for(i = 0; i < n / 2; i++){ 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
    } 
      
    public static void main(String args[]){ 
        int a[] = {2, 1, 8}; 
        int n = a.length; 
        
        System.out.println(findMaxDiff(a, n)); 
    } 
}
