import java.util.ArrayList;
import java.util.List;

/* Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears **once** or **twice**, return *an array of all the integers that appears **twice***.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

**Example 1:**

**Input:** nums = [4,3,2,7,8,2,3,1]

**Output:**

[2,3] */

public class q6 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List ans = findDuplicates(nums);

        System.out.println(ans.toString());
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int currentNum = Math.abs(nums[i]);

            if(nums[currentNum-1] < 0){
                res.add(currentNum);
            }
            else{
                nums[currentNum - 1] = - nums[currentNum - 1];
            }
        }
        return res;
    }
}
