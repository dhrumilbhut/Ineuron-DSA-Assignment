
// **Question 8**

// Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.


public class Question8 {
    public static int trap(int[] bars)
    {
        int n = bars.length;
        
        if (n <= 2) {
            return 0;
        }
 
        int water = 0;
 
       
        int[] left = new int[n-1];
        left[0] = Integer.MIN_VALUE;
 
        for (int i = 1; i < n - 1; i++) {
            left[i] = Integer.max(left[i - 1], bars[i - 1]);
        }
 
       
        int right = Integer.MIN_VALUE;
 
        for (int i = n - 2; i >= 1; i--)
        {
            right = Integer.max(right, bars[i + 1]);
 
            if (Integer.min(left[i], right) > bars[i]) {
                water += Integer.min(left[i], right) - bars[i];
            }
        }
 
        return water;
    }
 
    public static void main(String[] args)
    {
        int[] heights = { 0,1,0,2,1,0,1,3,2,1,2,1};
 
        System.out.print(trap(heights));
    }
}
