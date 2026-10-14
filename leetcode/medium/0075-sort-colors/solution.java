class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length,k=0;
        int[] count = new int[3];
        for(int i=0;i<n;i++)
            count[nums[i]]++;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<count[i];j++) 
                nums[k++] = i;
        }
    }
}