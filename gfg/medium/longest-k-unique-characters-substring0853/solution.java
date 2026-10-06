class Solution {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        int left=0,max=-1;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int right=0;right<n;right++)
        {
            char c = s.charAt(right);
            hm.put(c,hm.getOrDefault(c,0)+1);
            while(hm.size()>k)
            {
                char ch = s.charAt(left++);
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0)
                    hm.remove(ch);
            }
            if(hm.size()==k)
                max = Math.max(max, right - left +1);
        }
        return max;
        
    }
}