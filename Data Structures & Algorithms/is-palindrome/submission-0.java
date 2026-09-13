class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder strBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                strBuilder.append(Character.toLowerCase(c));
            }
        }
        String original = strBuilder.toString();
        String reversed = strBuilder.reverse().toString();
        if(reversed.equals(original)){
           return true;
        }else {
            return false;
        }
    }
}