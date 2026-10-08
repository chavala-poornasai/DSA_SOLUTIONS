class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0)
            return 0;
        int res=1;
        int left=0;
        HashSet<Character> hs = new HashSet<>();
        for(int right=0;right<n;right++)
        {
            while(hs.contains(s.charAt(right)))
            {
                hs.remove(s.charAt(left));
                left++;
            }
            res= Math.max(res,right-left+1);

            hs.add(s.charAt(right));
            
        }
        return res;
    }
}