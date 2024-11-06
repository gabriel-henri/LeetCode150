class Solution {
    public boolean isSubsequence(String s, String t) {
        int r = 0;
        int l = 0;

        if(s.length() > t.length()){
            return false;
        }

        while(r < t.length() && l < s.length()){
            if(t.charAt(r) == s.charAt(l)){
                l++;
               
            }
            r++;
        }

        if(l == s.length()){
            return true;
        }
        return false;
    }
}