class Solution {
    public int climbStairs(int n) {
        //n=3  1,1,1,1,2
        //[1,1,2,2]
         if(n<=1) return 1;
         if(n==2) return 2;
        // int[] dp = new int[n+1];
        // dp[0] = 1;
        // dp[1] = 1;

        int first = 1;
        int sec = 1;
        int cur = 0;
        for(int i=2; i<=n; i++){
            cur = first + sec ;
            first =  sec;
            sec = cur;
        }
        return cur;
        // for(int i=2; i<=n; i++){
        //     dp[i] = dp[i-1] + dp[i-2];
        // }


        
       // Arrays.fill(dp,-1);

        //return dp[n];
    }

    int ways(int n, int[] dp){
        if(n<=1) return 1;
        if(n==2) return 2;
        if(dp[n]!=-1) return dp[n];

        dp[n] = ways(n-1,dp) + ways(n-2,dp);

        return dp[n];
    }
}