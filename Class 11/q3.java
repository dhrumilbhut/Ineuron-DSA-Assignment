public class q3 {

	public static void main(String[] args) {
		int[] arr= new int[] {3,0,1,4,6,9,7,8,2};
		int missingIndex = findMissingIndex(arr);
		System.out.println(missingIndex);
	}

	public static int findMissingIndex(int[] nums) {
		int[] arr = new int[nums.length+1];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0)
				return i;
		}
		return -1;
	}
}