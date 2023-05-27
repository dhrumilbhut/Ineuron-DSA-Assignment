import java.util.HashSet;

/* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]
  */
public class q6 {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,1 };
        boolean ans = containsDuplicate(nums);

        if(ans){
            System.out.println("Contains Duplicate");
        } else {
            System.out.println("Not contain duplicate");
        }
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])) {
                    return true;
                }
                set.add(nums[i]);
        }
        return false;
    }
}
