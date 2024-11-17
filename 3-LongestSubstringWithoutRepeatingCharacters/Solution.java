import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> letras = new HashMap<>();
        int max = 0;
        int l = 0;
        int r = 0;
        
        while(r < s.length()){
            char pos = s.charAt(r);
            if(letras.containsKey(pos)){
                int val = letras.get(pos);
                letras.put(pos, val+1);
            }
            else{
                letras.put(pos, 1);
            }

            if(letras.get(pos) > 1){
                if((r - l) > max){
                    max = r-l;
                }
                while(l < r){
                    pos = s.charAt(l);
                    int val = letras.get(pos);
                    letras.put(pos, val-1);
                    if(letras.get(pos) == 1){
                        l++;
                        break;
                    }
                    l++;
                }
            }
            r++;
        }
        if((r -l) > max){
            max = r-l;
        }
        return max;
    }
}