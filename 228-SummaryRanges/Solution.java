class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> rangers = new ArrayList<>();

        if(nums.length == 0){
            return rangers;
        }

        int l = 0;
        int r = 0;

        while(r < nums.length){
            if(nums[r] - nums[l] == r - l){
                r++;
            }
            else{
                if(l == r-1){
                    String first = String.valueOf(nums[l]);
                    rangers.add(first);
                }
                else{
                    String first = String.valueOf(nums[l]);
                    String second = String.valueOf(nums[r-1]);
                    rangers.add(first + "->" + second);
                }
                l = r;
            }
        }
         if(l == r-1){
                    String first = String.valueOf(nums[l]);
                    rangers.add(first);
            }
        else{
                String first = String.valueOf(nums[l]);
                String second = String.valueOf(nums[r-1]);
                rangers.add(first + "->" + second);
            }
        return rangers;
    }
}