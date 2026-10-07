class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        boolean isValid = false;
        for(int i=0; i<s.length();i++){
           char c = s.charAt(i);
           //push opening bracket
           if(c == '(' || c== '[' || c== '{'){
             stack.push(c);
           }else{
            //check for closing bracket
            if(stack.isEmpty()) return false;
            char poped = stack.pop();
            if ((c == ')' && poped != '(') ||
                    (c == '}' && poped != '{') ||
                    (c == ']' && poped != '[')) {
                    return false;
            }
           }
           
        }
        return stack.isEmpty();
    }
}
