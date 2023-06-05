class q1 {
    public int minimumDeleteSum(String s1, String s2) {
        int n= s1.length(), m= s2.length();
        int dp[][] = new int [m+1][n+1];
        for (int i = 1; i < n+1; i++){
            dp[0][i] = dp[0][i-1] + s1.charAt(i-1);
        }
        for (int i = 1; i < m+1; i++){
            dp[i][0] = dp[i-1][0] + s2.charAt(i-1);
        }
        for (int i=1; i<m+1; i++){
            for (int j=1; j<n+1; j++){
                 if (s2.charAt(i-1) == s1.charAt(j-1)) dp[i][j] = dp[i-1][j-1]; 
                 else  dp[i][j] = Math.min(dp[i-1][j] + s2.charAt(i-1) , dp[i][j-1] + s1.charAt(j-1));
            }
        }
        return dp[m][n];
    }
}