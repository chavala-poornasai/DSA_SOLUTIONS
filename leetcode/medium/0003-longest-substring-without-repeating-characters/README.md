# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 105
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 66 ms (beats 41.92%)  
**Memory:** 48 MB (beats 26.20%)  
**Submitted:** 2026-10-08T01:19:24.004Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)