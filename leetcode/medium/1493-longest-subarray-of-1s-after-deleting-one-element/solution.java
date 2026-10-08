class Solution {
    public int longestSubarray(int[] nums) {
        int zercount=0,maxlen=0,left=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
                zercount++;
            while(zercount>1)
            {
                if(nums[left]==0)
                    zercount--;
                left++;
            }
            maxlen = Math.max(maxlen,right-left);
        }
        return maxlen;
    }
}