
        // int sum=0;
        // int left=0;
        // int minlen=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++)
        // {
        //     sum+=nums[i];
        //     while(sum>=target )
        //     {
        //         minlen=Math.min(minlen,i-left+1);
        //         sum-=nums[left];
        //         left++;
        //     }
        // }

        // return (minlen == Integer.MAX_VALUE) ? 0 : minlen;



class Solution {
    
//    int ans=0;
//    int l=0;
//    int length=Integer.MAX_VALUE;
   
//     for(int i=0;i<nums.length;i++)
//     {
//         ans+=nums[i];
//         while(ans>=target)
//         {
//             length=Math.min(length,i-l+1);
//            ans=ans-nums[l];
//            l++;
           

//         }

//     }
//     if(length==Integer.MAX_VALUE) return 0;

//       return length;









//     }
// }































public int minSubArrayLen(int target, int[] nums) {
    int left=0;
    int sum=0;
    int len=Integer.MAX_VALUE;

    for(int right=0;right<nums.length;right++)
    {

        //Expand window
        sum+=nums[right];
    

      
           //srink window
            while(sum>=target)
            {
                len=Math.min(len,right-left+1);
                 sum-=nums[left];
                  left++;
           
            }
           
          
           
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
    
}










