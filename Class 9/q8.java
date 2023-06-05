class q8 {
    public static void main (String[] args)
    {
        
      
      int arr[] = { 1, 2, 3, 4, 5 };
      int product = 1;
    
      
      int i = 0;
      int j = arr.length- 1;
    
      while (i < j) {
        product *= arr[i] * arr[j];
        i++;
        j--;
      }
    
      if (i == j) {
        product *= arr[i];
      }
    
      System.out.println( product);
    }
  }