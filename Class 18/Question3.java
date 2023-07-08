public class Question3  {
    private static int firstBadVersion(int n) {
        if(n==1)
            return 1;
        int low = 1;
        int high = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)){
                high = mid-1;
            }else{
                
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n));
    }
}