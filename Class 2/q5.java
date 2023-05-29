import java.util.Arrays;

/* Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6 */
public class q5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int ans = maximumProduct(nums);

        System.out.println(ans);
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[0] * nums[1] * nums[n-1] ,nums[n-1] * nums[n-2] * nums[n-3]);
    }
}
