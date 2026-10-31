class Solution {
  
    //   int j=0;
    //   for(int i=0;i<nums.length;i++)
    //   {
    //     if(nums[i]!=0)
    //     { 
    //         nums[j]=nums[i];
    //          j++;
    
    //     }
    //   }
    //   while(j<nums.length)
    //   {
    //     nums[j]=0;
    //     j++;
    //   }




//   public void moveZeroes(int[] nums) {

// int j=0;
//     for(int i=0;i<nums.length;i++)
//     {
//         if(nums[i]!=0)
//         {
//            nums[j]=nums[i];
//            j++;
//         }
        
//     }

//     while(j<nums.length)
//     {
//         nums[j]=0;
//         j++;
//     }








//     }


 public void moveZeroes(int[] nums)
 {
    // int j=0;
    // for(int i=0;i<nums.length;i++)
    // {
    //     if(nums[i]!=0)
    //     {
    //         nums[j]=nums[i];
    //         j++;
    //     }
    // }
    // while(j<nums.length)
    // {
    //     nums[j]=0;
    //     j++;
    // }

   int L=0;
    for(int R=0;R<nums.length;R++)
    {
        if(nums[R]!=0)
        {
            nums[L]=nums[R];
            L++;
        }
       
    }
    while(L<nums.length)
    {
        nums[L]=0;
        L++;
    }
 }






}