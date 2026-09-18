class Solution {
//     public int findDuplicate(int[] nums) {
// HashMap<Integer,Integer>map=new HashMap<>();
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++)
//         {
//            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
//         }
//         for(int key:map.keySet())
//         {
//             if(map.get(key)>1)
//             {
//                 return key;
//             }
//         }

//        return -1; 
//     }







public int findDuplicate(int[] nums) {

    int count=0;

    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++)
    {
        count++;
        if(nums[i]==nums[i+1])
        {
            count++;
        }
        else
        {
            count=0;
        }
        if(count>1)
        {
            return nums[i];
        }
    }

    return -1;
}







}