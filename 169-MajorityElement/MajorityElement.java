class Solution{
    public int majorityElement(int[] nums){
        int contador = 0;
        int candidato = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(contador == 0){
                candidato = nums[i];
                contador = 1;
            }
            else if(candidato == nums[i]){
                candidato += 1;
            }
            else{
                candidato -= 1;
            }
        }
        return candidato;
    }
}