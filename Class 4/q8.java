/* Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

*Return the array in the form* [x1,y1,x2,y2,...,xn,yn].

**Example 1:**

**Input:** nums = [2,5,1,3,4,7], n = 3

**Output:** [2,3,5,4,1,7] */

public class q8 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n=3;
        int[] ans = shuffle(nums, n);

        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] rev = new int[2*n];
         int j=0;
         for(int i=0;i<rev.length-1;i+=2){
             rev[i]=nums[j++];
             rev[i+1]=nums[n++];
         }
         return rev;
     }
}
