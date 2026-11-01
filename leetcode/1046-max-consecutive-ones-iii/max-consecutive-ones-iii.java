class Solution {
    // public int longestOnes(int[] nums, int k) {
    //     int left = 0;
    // int zeroCount = 0;
    // int maxLen = 0;

    // for (int right = 0; right < nums.length; right++) {

    //     if (nums[right] == 0) {
    //         zeroCount++;
    //     }

    //     while (zeroCount > k) {
    //         if (nums[left] == 0) {
    //             zeroCount--;
    //         }
    //         left++;
    //     }

    //     maxLen = Math.max(maxLen, right - left + 1);
    // }

    // return maxLen;
        
    // }


//         public int longestOnes(int[] nums, int k) {

//             int count=0;
//             int maxcount=Integer.MIN_VALUE;
//             int L=0;

//             for(int i=0;i<nums.length;i++)
//     {
//         if(nums[i]==0)
//         {
//             k--;
//         }
//         if(k<0)
//         {
//             if(nums[L]==0)
//             {
//                 k++;
//             }
//             L++;

//         }

//         count=i-L+1;

//         maxcount=Math.max(maxcount,count);

       




//     }
//      return maxcount;
// }
// }













 public int longestOnes(int[] nums, int k) {
   

   int count=0;
   int maxcount=Integer.MIN_VALUE;
   int b=k;
   int l=0;

   for(int i=0;i<nums.length;i++)
   {
     if(nums[i]==0)
     {
       count++;
       b--;
     }
     else
     {
        count++;
     }
     while(b<0)
     {
        if(nums[l]==0)
        {
            b++;
        }
        count--;
        l++;

     }

     maxcount=Math.max(maxcount,count);


   }



    return maxcount;
 }
}

















