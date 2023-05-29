/*  */

public class q7 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        if(isMonotonic(nums)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isMonotonic(int[] nums) {
        boolean increasing = false, decreasing = false;
        for (int i=1; i< nums.length; i++){
            if (nums[i]>nums[i-1]){
                increasing=true;
            } else if (nums[i]<nums[i-1]) {
                decreasing=true;
            }
        }
        boolean result = (increasing && decreasing) ? false:true;
        return result;
    }
}
