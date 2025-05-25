class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount+1];
        Arrays.fill(dp, -1);
        int res = countCoins(coins,amount,dp);
        return res>amount ? -1 : res;
    }

    int countCoins(int[] coins, int amt, int[] dp){
        if(amt == 0) return 0;
        if(amt < 0) return Integer.MAX_VALUE;
        if(dp[amt]!=-1) return dp[amt];
        int min = Integer.MAX_VALUE;
        for(int coin: coins){
            int res = countCoins(coins, amt-coin, dp);
            if(res!=Integer.MAX_VALUE){
                min = Math.min(min, res+1);
            }
        }

        dp[amt] = min;

        return dp[amt];
    }
}