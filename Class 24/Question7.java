import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Question7 {
    private static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || k <= 0) return new int[0];
        
        Deque<Integer> deque = new ArrayDeque<>();
        
        int[] ans = new int[nums.length + 1 - k];
        int ansIndex = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(!deque.isEmpty() && deque.getFirst() <= i - k) {
                deque.removeFirst();
            }
            
            while(!deque.isEmpty() && nums[deque.getLast()] < nums[i]) {
                deque.removeLast();
            }
            
            deque.addLast(i);
            
            if(i >= k - 1) {
                ans[ansIndex++] = nums[deque.getFirst()];
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ans));
    }
}
