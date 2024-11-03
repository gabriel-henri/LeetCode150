class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 0;

        while(r < nums.length){
            int rep = 1;
            while(r+1 < nums.length && nums[r] == nums[r+1]){
                rep++;
                r++;
            }
            if(rep == 1){
                nums[l] = nums[r];
                l++;
            }
            else{
                for(int i = 0; i < 2; i++){
                    nums[l] = nums[r];
                    l++;
                }
            }
            r++;
        }
        return l;
        
    }
}