import java.util.Arrays;

public class Question5 {
    public static int partition(int[] A)
    {
        int j = 0;
        int pivot = 0;   
 
       
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] < pivot)
            {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
 
                j++;
            }
        }
 
        return j;
    }
 
   
    public static void rearrange(int[] A)
    {
        
        int p = partition(A);
 
        
 
        for (int n = 0; (p < A.length && n < p); p++, n += 2)
        {
            int temp = A[n];
            A[n] = A[p];
            A[p] = temp;
        }
    }
 
    public static void main(String[] args)
    {
        int[] A = {1, 2, 3, -4, -1, 4 };
 
        rearrange(A);
 
        System.out.println(Arrays.toString(A));
    }
}
