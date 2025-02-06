import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> match = new HashMap<>();
        String[] words = s.split(" ");

        if(words.length != pattern.length()){
            System.out.println("Testando");
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){
            char key = pattern.charAt(i);
            String value = words[i];

            if(match.containsKey(key)){
                if(!match.get(key).equals(value)){
                    return false;
                }

            }
            else{
                if(match.containsValue(value)){
                    return false;
                }
                match.put(key, value);
                
            }
        }
        return true;
    }
}