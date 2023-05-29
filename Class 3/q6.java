public class q6 {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber(nums);
        System.out.println("Single Number: " + result);
    }

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
