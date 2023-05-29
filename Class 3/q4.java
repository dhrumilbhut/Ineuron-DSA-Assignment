/*  Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

**Example 1:**
Input: nums = [1,3,5,6], target = 5

 */
public class q4 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int ans = searchInsert(nums, 2);

        System.out.println(ans);
    }
    public static int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int left=0,right=n-1,mid;
        
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;

    }
}

