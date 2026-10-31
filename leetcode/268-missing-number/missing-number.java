import java.util.*;

class Solution {
  
        // Arrays.sort(nums);

        // int count = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != count) {
        //         return count; 
        //     }
        //     count++;
        // }

        // return nums.length; 









    // Arrays.sort(nums);
    // int n=nums.length;
    // int check=0;
    // for(int i=0;i<nums.length;i++)
    // {
    //     if(nums[i]!=check)
    //     {
    //         return check;
    //     }
    //     check++;

    // }




    //  return nums.length;

     
        // int check=0;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++)
        // {
        //    if(nums[i]!=check)
        //    {
        //     return check;
        //    }
        //    check++;
        // }
        // return nums.length;






//O(nlogn)
//  public int missingNumber(int[] nums) {

//     int j=0;
//     Arrays.sort(nums);

//     for(int i=0;i<nums.length;i++)
//     {
//         if(nums[i]!=j)
//         {
//            return j;

//         }
//         j++;
//     }



//   return nums.length;
    // }









    //  public int missingNumber(int[] nums) {
 
    //    int ans=nums.length;
    //    for(int i=0;i<nums.length;i++)
    //    {
    //     ans^=i;
    //     ans^=nums[i];
    //    }
    //      return ans;
    //  }







public int missingNumber(int[] nums) {

  int ans=0;

  for(int i=0;i<nums.length;i++)
  {
    ans^=i;
    ans^=nums[i];
  }
  ans^=nums.length;

  return ans;

}















}