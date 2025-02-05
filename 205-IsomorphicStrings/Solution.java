package 205-IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> replace = new HashMap<Character, Character>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            char sCaracter = s.charAt(i);
            char tCaracter = t.charAt(i);

            if(replace.containsKey(sCaracter)){
                if(replace.get(sCaracter) != tCaracter){
                    return false;
                }
            }
            else{
                if(replace.containsValue(tCaracter)){
                    return false;
                }
                replace.put(sCaracter, tCaracter);
            }
        }

        return true;
    }
}
