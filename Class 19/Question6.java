public class Question6 {
     public static void main (String[] args) {
      int[] arr1 = {1,3,4,5};
      int n1 = arr1.length;
      int[] arr2 = {2,4,6,8};
      int n2 = arr2.length;
      int[] merge = new int[n1 + n2];
      int i = 0, j = 0, k = 0, x;
      for (x = 0; x < n1; x++)
      for (x = 0; x < n2; x++)
      while (i < n1 && j < n2) {
         if (arr1[i] < arr2[j])
            merge[k++] = arr1[i++];
         else
            merge[k++] = arr2[j++];
      }
      while (i < n1)
      merge[k++] = arr1[i++];
      while (j < n2)
      merge[k++] = arr2[j++];
      for (x = 0; x < n1 + n2; x++)
      System.out.print(merge[x] + " ");
   }
}
