import java.util.HashMap;
import java.util.Map;


class Solution {
    private void contReptition(Map<Character, Integer> count, String letters){
        for(char letter:letters.toCharArray()){
            if(count.containsKey(letter)){
                int value = count.get(letter);
                count.replace(letter, value + 1);
            }
            else{
                count.put(letter, 1);
            }
        }
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> lettersReptition = new HashMap<>();
        this.contReptition(lettersReptition, magazine);

        for(char letter:ransomNote.toCharArray()){
            if(lettersReptition.containsKey(letter)){
                int valor = lettersReptition.get(letter)-1;
                if(valor == 0){
                    lettersReptition.remove(letter);
                }
                else{
                    lettersReptition.replace(letter, valor);
                }
            }
            else{return false;}
        }
    
        return true;
    }
}