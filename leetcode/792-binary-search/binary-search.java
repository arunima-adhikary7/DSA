class Solution {
  
        // int f=0;
        // int l=nums.length-1;
        // int n=nums.length;
        // while(f<=l)
        // {
        //     int m=f+(l-f)/2;
        //     if(nums[m]==target)
        //     {
        //         return m;
        //     }
        //     else if(nums[m]>target)
        //     {
        //         l=m-1;
        //     }
        //     else{
        //         f=m+1;
        //     }
        // }
        // return -1;
       

  
   

    // return binarySearch(nums,target,0,n-1);



    // }
    // public int binarySearch(int nums[], int target, int f, int l) {
    //     if (f > l) return -1;

    //     int m = f + (l - f) / 2;

    //     if (nums[m] == target) return m;

    //     else if (nums[m] > target)
    //         return binarySearch(nums, target, f, m - 1);
    //     else
    //         return binarySearch(nums, target, m + 1, l);
    // }




//   public int search(int[] nums, int target) {

//       int left=0;
//       int right=nums.length-1;
       
//       while(left<=right)
//       {
//         int mid=right+(left-right)/2;
//         if(nums[mid]==target)
//         {
//             return mid;
//         }
//         else if(nums[mid]>target)
//         {
//             right=mid-1;

//         }
//         else
//         {
//             left=mid+1;
//         }
//       }



//     return -1;


// }
// }












 public int search(int[] nums, int target) {

    int l=0;
    int r=nums.length-1;

    while(l<=r)
    {
        int mid=l+(r-l)/2;

        if(nums[mid]==target) return mid;

        else if(nums[mid]<target)
        {
            l=mid+1;

        }
        else
        {
            r=mid-1;
        }
    }

    return -1;







 }
}















