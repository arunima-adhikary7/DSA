class Solution {
    // public int singleNumber(int[] nums) {
    //     //O(nlogn) space O(1)
        
    //             Arrays.sort(nums);
    //     int count=0;
    //     for(int i=1;i<nums.length;i+=2)
    //     {
    //        if(nums[i]==nums[i-1])
    //        {
    //            continue;
    //        }
    //        return nums[i-1];
          
    //     }
    //     return nums[nums.length - 1];
    // }




// public int singleNumber(int[] nums) {

//     int ans=0;
//     for(int i:nums)
//     {
//         ans^=i;
//     }


// return ans;


// }




// }



















public int singleNumber(int[] nums) {
    int ans=0;

    for(int i:nums)
    {
        ans^=i;

    }
    return ans;
}
}