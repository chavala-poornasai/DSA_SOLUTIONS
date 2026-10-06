# Subarray Sum Equals K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`, return  *the total number of subarrays whose sum equals to*  `k`.

A subarray is a contiguous  **non-empty**  sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,1,1], k = 2
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 3
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -1000 <= nums[i] <= 1000
- -107 <= k <= 107

## Solution

**Language:** Java  
**Runtime:** 24 ms (beats 75.18%)  
**Memory:** 49 MB (beats 34.39%)  
**Submitted:** 2026-10-06T13:24:16.162Z  

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(hm.containsKey(sum-k))
                count+=hm.get(sum-k);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }      
        return count;  
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/)