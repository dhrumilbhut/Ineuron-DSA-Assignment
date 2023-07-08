public class Question5 {
    private static int findTheWinner(int n, int k) {
        return findWinnerHelper(n, k - 1) + 1;
    }
    
    private static int findWinnerHelper(int n, int k) {
        if (n == 1) {
            return 0;
        }
        
        return ((k + 1) % n + findWinnerHelper(n - 1, k)) % n;       
    }
    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println(findTheWinner(n,k));
    }
}
