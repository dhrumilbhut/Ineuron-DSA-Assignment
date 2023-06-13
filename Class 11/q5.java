import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q5 {
	public static void main(String[] args) {
		int[] nums1=new int[] {1,2,2,1};
		int[] nums2=new int[] {2,2};
		Set<Integer> set = intersection(nums1, nums2);
		System.out.println(set);
	}

	public static Set<Integer> intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<>();
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
				set.add(nums1[i]);
				i++;
				j++;
			}

		}
		return set;
	}
}