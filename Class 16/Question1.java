
//  **Question 1**

// Given an array, for each element find the value of the nearest element to the right which is having a frequency greater than that of the current element. If there does not exist an answer for a position, then make the value ‘-1’.


import java.util.HashMap;

public class Question1 {
    public static int[] nextGFE(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[n];
        for(int e : arr){
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        
        for(int i = 0; i < n; i++){
            boolean found = false;
            for(int j = i+ 1; j< n;j++){
                if(map.get(arr[j])>map.get(arr[i])){
                    ans[i] = arr[j];
                    found = true;
                    break;
                }
            }
            if(!found){
                ans[i] = -1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 2, 3, 4, 2, 1};
        int ans[] = nextGFE(arr, arr.length);
        for(int e : ans){
            System.out.print(e+" ");
        }
    }
}