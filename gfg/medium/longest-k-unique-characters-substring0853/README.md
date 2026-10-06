# Longest Substring with K Uniques

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string  **s**  consisting only lowercase alphabets and an integer  **k**. Your task is to find the  **length** of the  **longest substring**  that contains exactly  **k**  distinct characters.

 **Note :**  If no such substring exists, return  **-1**. 

 **Examples:** 

```
Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.

```

```
Input: s = "aaaa", k = 2
Output: -1
Explanation: There's no substring with 2 distinct characters.

```

```
Input: s = "aabaaab", k = 2
Output: 7
Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T05:03:02.580Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1)