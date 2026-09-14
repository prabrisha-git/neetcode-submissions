class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int numToBeFound;
        for(int i = 0; i< numbers.length; i++){
            numToBeFound = target - numbers[i];
            if(hm.containsKey(numToBeFound)){
                return new int[]{hm.get(numToBeFound), i+1};
            }else{
                hm.put(numbers[i], i+1);
            }

        }
        return new int[]{};
    }
}
