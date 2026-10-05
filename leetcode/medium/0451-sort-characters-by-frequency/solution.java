class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c: s.toCharArray())
            hm.put(c,hm.getOrDefault(c,0)+1);
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> hm.get(b)-hm.get(a));
        pq.addAll(hm.keySet());
        StringBuffer res = new StringBuffer();
        while(!pq.isEmpty())
        {
            int t=1;
            char c = pq.poll();
              t = hm.get(c);
            for(int i=1;i<=t;i++)
                res.append(c);
        }
        return res.toString();
    }
}