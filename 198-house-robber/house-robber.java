class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<=0) return 0;
        if(n==1) return nums[0];

       int first = 0;
       int sec = nums[0];
       int cur = 0;
       for(int i=1; i<n; i++){
        cur = Math.max(nums[i]+first , sec);
        first = sec;
        sec = cur;
       }

       return cur;
       
       // int[] dp = new int[n+1];
        
        // dp[0] = 0;
        // dp[1] = nums[0];
        // for(int i=2; i<=n; i++){
        //     dp[i] = Math.max(nums[i-1]+dp[i-2], dp[i-1]);
        // }

        // return dp[n];
        // Arrays.fill(dp,-1);
        // return maxLoot(nums, n, dp);
    }

    int maxLoot(int[] nums, int n, int[] dp){
        if(n<=0) return 0;
        if(n==1) return nums[0];
        if(dp[n] != -1) return dp[n];

        int pick = nums[n-1] + maxLoot(nums, n-2, dp);
        int notPick = maxLoot(nums, n-1, dp);

        dp[n] = Math.max(pick, notPick);

        return dp[n];
    }
}