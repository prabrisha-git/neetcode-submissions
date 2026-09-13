class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int n : nums){    
          hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entrySet : hm.entrySet()){
           if(entrySet.getValue() > 1){
                return true;
           }
        }
        return false;     
    }
}