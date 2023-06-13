import java.util.Arrays;

public class q7 {

	public static void main(String[] args) {
		int[] nums=new int[] {5,7,7,8,8,10};
		int[] index = findTargetIndex(nums, 8);
		System.out.println(Arrays.toString(index));
	}
	
	public static int[] findTargetIndex(int[] nums,int target) {
		int[] ans= new int[] {-1,-1};
		int f=0;
		int l=nums.length-1;
		int mid;
		while (f<=l) {
			mid=(f+l)/2;
			if(nums[mid]==target) {
				if(nums[mid-1]==target) {
					ans[0]=mid-1;
					ans[1]=mid;
				}
				if(nums[mid+1]==target) {
					ans[0]=mid;
					ans[1]=mid+1;
				}
			}
			if(nums[mid]<target)
				f=mid+1;
			else
				l=mid-1;
		}
		return ans;
	}
	

}