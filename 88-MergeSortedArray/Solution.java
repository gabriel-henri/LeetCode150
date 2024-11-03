class Solution {
    public void ordena(int[] nums, int n){
        for(int i = 0; i < n-1; i++){
            if(nums[i] > nums[i+1]){
                int aux = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = aux;
            }
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int aux;
        while(i < (m+n) && j < n){
            if(i < m){
                if(nums1[i] > nums2[j]){
                    aux = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = aux;

                    ordena(nums2, n);
                }
                i++;
            }
            else{
                aux = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = aux;
                j++;
                i++;
            }
        }
    }
}