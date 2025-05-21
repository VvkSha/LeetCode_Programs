class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int cur =0; int prev = 0; int prev1=0;
        for(int i=2; i<=n; i++){
            cur = Math.min(cost[i-1]+prev, cost[i-2]+prev1);
            prev1= prev;
            prev = cur;
        }

        return cur;
        // int[] dp = new int[n+1];
        // dp[0] = 0;
        // dp[1]= 0;
        // for(int i=2; i<=n; i++){
        //     dp[i] = Math.min(cost[i-1]+dp[i-1], cost[i-2]+dp[i-2]);
        // }

        // return dp[n];
        // Arrays.fill(dp,-1);
        // return ways(n,cost,dp);
        
    }

    int ways(int n, int[] cost, int[] dp){
        if(n<=1) return 0;
        if(dp[n]!=-1) return dp[n];
        dp[n] = Math.min((cost[n-1]+ways(n-1,cost,dp)),(cost[n-2]+ways(n-2,cost,dp)));
        return dp[n];
    }
}