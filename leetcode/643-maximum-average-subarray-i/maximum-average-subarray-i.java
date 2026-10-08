class Solution {
       
    //    int left=0;
    //    int sum=0;
    //    for(int i=0;i<k;i++)
    //    {
    //     sum+=nums[i];
    //    }
    //    int maxsum=sum;

    //    while(left+k<nums.length)
    //    {
    //     sum=sum-nums[left]+nums[left+k];
    //     left++;
    //     maxsum=Math.max(maxsum,sum);
    //    }
    //    return (double)maxsum/k;

    // int left=0;
    // int sum=0;
    // for(int i=0;i<k;i++)
    // {
    //     sum+=nums[i];
    // }
    // int maxsum=sum;
    // while(left+k<nums.length)
    // {
    //     sum=sum-nums[left]+nums[left+k];
    //     left++;
    //     maxsum=Math.max(maxsum,sum);
    // }
    //  return (double)maxsum/k;   




    //  int left=0;
    //  int sum=0;
    //  for(int i=0;i<k;i++)
    //  {
    //     sum+=nums[i];
    //  }
    //  int maxsum=sum;

    //  while(left+k<nums.length)
    //  {
    //     sum=sum-nums[left]+nums[left+k];
    //     left++;
    //     maxsum=Math.max(maxsum,sum);
    //  }
    //  return (double)maxsum/k;




    public double findMaxAverage(int[] nums, int k) {
    
       
       int left=0;
       int sum=0;
       int right=nums.length-1;
       double avg=Integer.MIN_VALUE;
       double maxsum;
      for(int i=0;i<k;i++)

      {
        sum+=nums[i];
      
      }
      maxsum=sum;

      while(left+k<=right)
      {
         sum-=nums[left];
         left++;
         sum+=nums[left+k-1];
         maxsum=Math.max(maxsum,sum);
         
      }
      
      return (double)(maxsum/k);











    }
}