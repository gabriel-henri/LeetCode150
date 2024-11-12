class Solution {
    public int maxArea(int[] height) {
        int output = 0;
        int l = 0;
        int r = height.length-1;

        while(r > l){
            int min = height[l] < height[r] ? height[l]:height[r];


            if(output < min * (r-l)){
                output = min * (r-l);
            }

            if(height[r] > height[l]){
                l++;
            }
            else{
                r--;
            }
        }
        return output;
    }
}