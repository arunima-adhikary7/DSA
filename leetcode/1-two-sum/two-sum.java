class Solution {
   // public int[] twoSum(int[] nums, int target) {


    //    HashMap<Integer, Integer> map = new HashMap<>();

    //     for(int i = 0; i < nums.length; i++)
    //     {
    //         int sum = target - nums[i];

    //         if(map.containsKey(sum))
    //         {
    //             return new int[]{map.get(sum), i};
    //         }

    //         map.put(nums[i], i);
    //     }

    //     return new int[]{};












// HashMap<Integer,Integer> map=new HashMap<>();
// for(int i=0;i<nums.length;i++)
// {
//     int remaining=target-nums[i];
//     if(map.containsKey(remaining))
//     {
//         return new int[]{map.get(remaining),i};
//     }
//     map.put(nums[i],i);
// }
// return new int[]{};

// HashMap<Integer,Integer> map=new HashMap<>();
// for(int i=0;i<nums.length;i++)
// {
//     int re=target-nums[i];
//     if(map.containsKey(re))
//     {
//         return new int[]{map.get(re),i};
//     }

//     map.put(nums[i],i);
// }
 
// return new int[]{};













// HashMap<Integer,Integer>map=new HashMap<>();
// for(int i=0;i<nums.length;i++)
// {
   
//     int re=target-nums[i];
//     if(map.containsKey(re))
//     {
//         return new int[] {map.get(re),i};
//     }
//      map.put(nums[i],i);

// }
// return new int[]{};














//brute-force O(n2)
// public int[] twoSum(int[] nums, int target) {
//     int n=nums.length;
//      int[] a=new int[2];
//     for(int i=0;i<n;i++)
//     {
//         for(int j=i+1;j<n;j++)
//         {
//             if(nums[i]+nums[j]==target)
//             {
//                a[0]=i;
//                a[1]=j;
//                break;
//             }
//         }
//     }

//     return a;

//     }




    // public int[] twoSum(int[] nums, int target) {

    //     HashMap<Integer,Integer>map=new HashMap<>();
    //     //   int[] ans=new int[2];
    //       int j=0;
    //     for(int i=0;i<nums.length;i++)
    //     { 
    //         int re=target-nums[i];
    //         if(map.containsKey(re))
    //         {
    //         //    ans[j++]=map.get(re);
    //         //    ans[j++]=i;
    //         return new int[] {map.get(re),i};
    //         }
    //         map.put(nums[i],i);
    //     }



    //    return new int[]{};
    // }
//     public int[] twoSum(int[] nums, int target) {

//     HashMap<Integer, Integer> map = new HashMap<>();

//     for (int i = 0; i < nums.length; i++) {

//         Integer idx = map.get(target - nums[i]);

//         if (idx != null) {
//             return new int[]{idx, i};
//         }

//         map.put(nums[i], i);
//     }

//     return new int[]{};
// }
// }


    // public int[] twoSum(int[] nums, int target) {
    //     HashMap<Integer,Integer>map=new HashMap<>();

    //     for(int i=0;i<nums.length;i++)
    //     {
    //         int re=target-nums[i];
    //         if(map.containsKey(re))
    //         {
    //             return new int[]{map.get(re),i};

    //         }
    //         map.put(nums[i],i);
    //     }

    // return new int[]{};

    // }
    // }














    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int re=target-nums[i];
            if(map.containsKey(re))
            {
                return new int[]{map.get(re),i};
            }

            map.put(nums[i],i);
        }

     return new int[]{};





    }}
















