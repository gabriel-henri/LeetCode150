public class Solution {
    public void reverse(int[] nums, int begin, int end){
        while(begin < end){
            int aux = nums[end];
            nums[end] = nums[begin];
            nums[begin] = aux;
            begin++;
            end--;
        }
    }

    public void rotate(int[] nums, int k){
        int move = k % nums.length;

        if(move != 0){
            reverse(nums, 0, nums.length-1);
            reverse(nums, 0, move-1);
            reverse(nums, move, nums.length-1);
        }
    }
}
