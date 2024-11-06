class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int begin = 0;
        int end = numbers.length -1;
        int[] answer = {0, 0};

        while(begin < end){
            if(numbers[begin]+numbers[end] == target){
                answer[0] = begin+1;
                answer[1] = end+1;

                return answer;
            }
            else if(numbers[begin]+numbers[end] > target){
                end--;
            }
            else{
                begin++;
            }
        }
        return answer;
    }
}