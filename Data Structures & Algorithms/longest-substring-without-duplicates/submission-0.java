class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int len = 0;
        int left = 0;
        int right = 0;
        Set<Character> hs = new HashSet<>();
        
        while(right<s.length()){
           char i = s.charAt(right);
           while(hs.contains(i)){
            hs.remove(s.charAt(left));
            left++;
           }
           hs.add(i);
           maxLength = Math.max(right - left +1,maxLength);
           right++;
        }
        
        return maxLength;
        
    }
}
