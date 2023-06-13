public class q4 {
	
	public static void main(String[] args) {
		int[] arr= new int[] {1,5,3,2,7,6,7,4};
		System.out.println(findRepeatedNumber(arr));
	}

	public static int findRepeatedNumber(int[] nums) {
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==2)
				return i;
		}
		return -1;
	}
}