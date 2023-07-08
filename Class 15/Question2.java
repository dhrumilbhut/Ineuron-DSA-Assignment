
//  **Question 2**

// Given an array **a** of integers of length **n**, find the nearest smaller number for every element such that the smaller element is on left side.If no small element present on the left print -1.


public class Question2 {
    public static void findPrevSmaller(int[] arr){
        if (arr == null || arr.length == 0) {
            return;
        }
 
        for (int i = 0; i < arr.length; i++)
        {
            int prev = -1;
 
            for (int j = i - 1; j >= 0; j--)
            {
                
                if (arr[j] < arr[i])
                {
                    prev = arr[j];
                    break;
                }
            }
 
            System.out.print(prev + " ");
        }
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 1,6,2 };
        findPrevSmaller(arr);
    }
}
