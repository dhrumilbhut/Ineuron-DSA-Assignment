

public class Question3 {
     private static int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;
        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) 
                    count += 1;
            }
            if (count > majorityCount) 
                return num;
        }
        return -1;    
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 3, 2, 3 };
 
        int result = majorityElement(nums);
        if (result != -1) {
            System.out.println(result);
        }
        else {
            System.out.println("doesn't exist");
        }
    }
}
