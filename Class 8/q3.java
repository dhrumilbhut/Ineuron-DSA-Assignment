class q3 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int lcs = LCS(word1,word2,m,n);  
        return m+n-(2*lcs);
    }
    private static int LCS(String s1,String s2,int m,int n){
        if(n==0 || m==0) return 0;
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1+LCS(s1,s2,m-1,n-1);
        }
        else
            return Math.max(LCS(s1,s2,m-1,n),LCS(s1,s2,m,n-1));
    }
}