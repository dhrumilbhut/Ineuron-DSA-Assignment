import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*

- answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
- answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.

**Note** that the integers in the lists may be returned in **any** order.

**Example 1:**

**Input:** nums1 = [1,2,3], nums2 = [2,4,6]

**Output:** [[1,3],[4,6]] */

public class q4 {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        List<List<Integer>> result = findDifference(nums1, nums2);

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
           set2.add(nums2[i]);
           if(set1.contains(nums2[i]))
                set1.remove(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            if(set2.contains(nums1[i]))
                    set2.remove(nums1[i]);
        }

        ans.add(new ArrayList<Integer>(set1));
        ans.add(new ArrayList<Integer>(set2));
        return ans;
    }
}
