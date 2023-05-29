import java.util.Arrays;

/* Given an integer array nums of length n and an integer target, find three integers
in nums such that the sum is closest to the target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2 */
public class q1 {
    public static void main(String[] args) {
        int[] nums = { -1,2,1,-4 };
        int target = 9;
        int ans = threeSumClosest(nums, target);

        System.out.println(ans);
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDistance = Integer.MAX_VALUE;
        int closestSum = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                int distance = Math.abs(target - sum);

                if(sum == target) {
                    return sum;
                }  

                if(distance < minDistance) {
                    minDistance = distance;
                    closestSum = sum;
                }

                if(sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return closestSum;
    }
}