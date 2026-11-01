class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       
        
        return atmost(nums,k) -atmost(nums,k-1);
    }
    public static int atmost(int[] nums,int k)
    {
         int left=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                k--;
            }
            while(k<0)
            {
                if(nums[left]%2!=0)
                {
                    k++;
                }
               
                left++;

            }
             count+=i-left+1;
        }
        return count;
    }
}