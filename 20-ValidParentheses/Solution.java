import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> valid = new Stack<>();

        for(char letter: s.toCharArray()){
            if(letter == '(' || letter == '{' || letter == '['){
                valid.push(letter);
            }else{
                if(valid.isEmpty()){
                    return false;
                }
                char top = valid.peek();

                if(top == '(' && letter == ')'){
                    valid.pop();
                }else if(top == '{' && letter == '}'){
                    valid.pop();
                }else if(top == '[' && letter == ']'){
                    valid.pop();
                }
                else{
                    return false;
                }
            }
        }
        return valid.isEmpty();
    }
}