class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(seen.contains(nums[i])){
                return true;
            }

            seen.add(nums[i]);
        }

        return false;
    }
}