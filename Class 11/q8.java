import java.util.Arrays;

public class q8 {

	public static void main(String[] args) {
		int[] nums1=new int[] {4,9,5};
		int[] nums2=new int[] {9,4,9,8,4};
		intersection(nums1, nums2);
	}

	public static void intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0;
		int j = 0;
		int l1 = nums1.length;
		int l2 = nums2.length;
		while (i < l1 && j < l2) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				System.out.print(nums1[i] + " ");
				i++;
				j++;
			}

		}
	}
}