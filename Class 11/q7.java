import java.util.Arrays;

public class q7 {

	public static void main(String[] args) {
		int[] nums=new int[] {5,7,7,8,8,10};
		int[] index = findTargetIndex(nums, 8);
		System.out.println(Arrays.toString(index));
	}
	
	public static int[] findTargetIndex(int[] nums,int target) {
		int[] output = {-1,-1};

        int left = 0 ;
        int right = nums.length - 1;
        

        while (left <= right){
           if(nums[left] == target){
               output[0] = left;

               while (left < right){
                   if(nums[right] == target){
                       output[1] = right;
                       return output;
                   } else {
                       right = right - 1;
                   }
               }

               output[1] = left;
               return output;

           } 
           else if(nums[left] < target){
               left = left + 1;
           } 
           else if(nums[right] > target){
               right = right - 1;
           }
        }
        return output;
	}
	

}
