import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);

        int k = 0;
        int i;
        int j;
        while(k < nums.length-2){
            if(k > 0 && nums[k] == nums[k-1]){
                k++;
            }
            else{
                i = k+1;
                j = nums.length-1;

                while(i < j){
                    int sum = nums[k] + nums[i] + nums[j];
                    if(sum > 0){
                        j--;
                    }
                    else if(sum < 0){
                        i++;
                    }
                    else{
                        List<Integer> ans = new ArrayList<>(Arrays.asList(nums[k], nums[i], nums[j]));
                        results.add(ans);
                        i++;

                        while(nums[i] == nums[i-1] && i < j){
                            i++;
                        }
                    }
                    
                }
                k++;
            }
            
        }
        return results;
    }
}