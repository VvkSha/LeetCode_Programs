class Solution {
    public void rotate(int[] nums, int k) {
        

        int n  = nums.length;
        if(n==1){
            return;
        }
        int[] temp = new int[n];
        int j=0;
        k = k % n;
        for(int i=n-k; i<n; i++){
            temp[j] = nums[i];
            j++;
        }
        for(int i=0; i<n-k; i++){
            temp[j] = nums[i];
            j++;
        }
        for(int i=0; i<n; i++){
            nums[i] = temp[i];
        }
        // for(int i=0; i<k; i++){
        //     int last = nums[n-1];
        //     for(int j=n-1; j>0; j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = last;
        // }
    }
}