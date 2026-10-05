# Sort Characters By Frequency

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, sort it in  **decreasing order**  based on the  **frequency**  of the characters. The  **frequency**  of a character is the number of times it appears in the string.

Return  *the sorted string*. If there are multiple answers, return  *any of them*.

 

 **Example 1:** 

```
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

```

 **Example 2:** 

```
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.

```

 **Example 3:** 

```
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.

```

 

 **Constraints:** 

- 1 <= s.length <= 5 * 105
- s consists of uppercase and lowercase English letters and digits.

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 60.29%)  
**Memory:** 46.7 MB (beats 39.86%)  
**Submitted:** 2026-10-05T05:13:40.219Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/sort-characters-by-frequency/)