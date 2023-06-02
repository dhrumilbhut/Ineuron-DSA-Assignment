/* Given an array of integers arr, return *true if and only if it is a valid mountain array*.

Recall that arr is a mountain array if and only if:

- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
    - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
    
    **Example 1:**

    **Input:** arr = [2,1]

    **Output:**

        false

    */

public class q3 {
    public static void main(String[] args) {
        int[] nums = {0,3,2,1};

        if(validMountainArray(nums)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false; 
        int i = 0;
        while (i < n-1 && arr[i] < arr[i+1]) {
            i++;
        }
        if (i == 0 || i == n-1) return false;
        
        while (i < n-1 && arr[i] > arr[i+1]) {
            i++;
        }
        return i == n-1; 
    }
}
