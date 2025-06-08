class Solution {

    public void reverseNum(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        

        int n  = nums.length;
        k = k % n;
        if(n==1){
            return;
        }
        reverseNum(nums, 0, n-1);
        reverseNum(nums, 0, k-1);
        reverseNum(nums, k, n-1);
        // int[] temp = new int[n];
        // int j=0;
        // k = k % n;
        // for(int i=n-k; i<n; i++){
        //     temp[j] = nums[i];
        //     j++;
        // }
        // for(int i=0; i<n-k; i++){
        //     temp[j] = nums[i];
        //     j++;
        // }
        // for(int i=0; i<n; i++){
        //     nums[i] = temp[i];
        // }
        // for(int i=0; i<k; i++){
        //     int last = nums[n-1];
        //     for(int j=n-1; j>0; j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = last;
        // }
    }
}