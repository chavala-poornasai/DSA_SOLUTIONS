class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            if(hm.containsKey(target-numbers[i]))
                return new int[]{hm.get(target-numbers[i])+1,i+1} ;
            hm.put(numbers[i],i);
        } 
        return new int[]{-1,-1};
    }
}