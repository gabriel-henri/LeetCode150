class Solution {
    public boolean isPalindrome(String s) {
        int begin = 0;
        int end = s.length()-1;

        while(begin < end){
            char cb = s.charAt(begin);
            char ce = s.charAt(end);
            if(Character.isLetterOrDigit(cb) && Character.isLetterOrDigit(ce)){
                if(Character.toUpperCase(cb) != Character.toUpperCase(ce)){
                    return false;
                }
                begin++;
                end--;
            }
            else{
                if(!(Character.isLetterOrDigit(cb))){
                    begin++;
                }
                if(!(Character.isLetterOrDigit(ce))){
                    end--;
                }
            }
        }
        return true;
    }
}