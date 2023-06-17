public class q4 {
	
	public static void main(String[] args) {
		int[] arr= new int[] {1,5,3,2,7,6,7,4};
		System.out.println(findRepeatedNumber(arr));
	}

	public static int findRepeatedNumber(int[] nums) {
		 Arrays.sort(nums);
	        int cur = nums[0];
	        int ans = cur;
	
	        for (int i=1; i<nums.length; i++){
	            if(nums[i] == cur){
	                ans = nums[i];
	                break;
	            }
	            cur = nums[i];
	        }
	        return ans;
	}
}
