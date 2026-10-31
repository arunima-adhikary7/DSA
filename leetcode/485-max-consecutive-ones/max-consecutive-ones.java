class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=Integer.MIN_VALUE;
        for(int i:nums)
        {
            if(i==1)
            {
                count++;
            }
            else
            {
                maxcount=Math.max(maxcount,count);
                count=0;

            }

        }
       maxcount=Math.max(maxcount,count);

        return maxcount;
        
    }
}