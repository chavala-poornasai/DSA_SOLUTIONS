class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int max =0;
        int[] freq = new int[26];
        int left=0,maxf=0;
        for(int right=0;right<n;right++)
        {
            freq[s.charAt(right)-'A']++;
            maxf = Math.max(maxf,freq[s.charAt(right)-'A']);
            int rep = (right - left +1 ) - maxf;
            while(rep > k )
            {
                freq[s.charAt(left)-'A']--;
                left++;
                rep = (right - left + 1 ) - maxf;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}