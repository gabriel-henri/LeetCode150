class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letters_reptitionS = new int[26];
        int[] letters_reptitionT = new int[26];

        if(s.length() != t.length())
            return false;

        for(int i = 0; i < s.length(); i++){
            char letterS = s.charAt(i);
            char letterT = t.charAt(i);

            letters_reptitionS[letterS-'a'] += 1;
            letters_reptitionT[letterT-'a'] += 1;
        }

        for(int i = 0; i < letters_reptitionS.length; i++){
            if(letters_reptitionS[i] != letters_reptitionT[i])
                return false;
        }
        return true;
    }
}