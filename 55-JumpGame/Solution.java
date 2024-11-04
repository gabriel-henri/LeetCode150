class Solution {
    public boolean canJump(int[] nums) {
        int l = 0;
        int r = 0;

        while(r < nums.length){
            if(nums[r] >= nums.length - r - 1){
                return true;
            }
            else if(nums[r] > 0){
                r++;
            }
            else{
                if(nums[l] + l > r){
                    r++;
                }
                else if(l < r){
                    l++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}