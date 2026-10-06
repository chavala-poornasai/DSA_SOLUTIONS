# Longest Repeating Character Replacement

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times.

Return  *the length of the longest substring containing the same letter you can get after performing the above operations*.

 

 **Example 1:** 

```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

```

 **Example 2:** 

```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only uppercase English letters.
- 0 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 89.30%)  
**Memory:** 46.1 MB (beats 79.13%)  
**Submitted:** 2026-10-06T06:06:59.241Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/longest-repeating-character-replacement/)