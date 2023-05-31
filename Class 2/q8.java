/* You are given an integer array nums and an integer k.

In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

Example 1:
Input: nums = [1], k = 0
Output: 0

Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0. */

public class q8 {
    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int ans = smallestRangeI(nums, k);
        System.out.println(ans);
    }

    public static int smallestRangeI(int[] nums, int k) {
        //find max and min element 
        int max, min;
        max=min=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);

        }
        // how will be the difference will be minimum
        // when we max=max-k and min=min+k;

        int diff= (max-k)-(min+k);

        return (diff>0) ? diff : 0;

    }
}
