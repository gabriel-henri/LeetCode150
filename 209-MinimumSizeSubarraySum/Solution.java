class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int r = 0;
        int l = 0;
        int minimal = 0;
        int sum = 0;
        
        while(r < nums.length && l <= r){
            sum += nums[r];

            if(sum >= target){
                while(sum - nums[l] >= target){
                    sum -= nums[l];
                    l++;
                }
                if((r-l) < minimal || minimal == 0){
                    minimal = r-l+1;
                }
            }
            r++;  
        }
        return minimal;
    }
}