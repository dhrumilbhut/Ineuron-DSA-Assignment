public class Question8 {
     private static boolean find132pattern(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1; j < nums.length - 1; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[k] > nums[i] && nums[j] > nums[k]) {
            return true;
          }
        }
      }
    }

    return false;
  }
  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    System.out.println(find132pattern(nums));
  }
}
