class Solution {
//  List<List<Integer>> res=new ArrayList<>();
//          Arrays.sort(nums);
//         boolean []check=new boolean[nums.length];
//         List<Integer>ds=new ArrayList<>();
//         compute(res,check,ds,nums);
//         return res;
        
//     }
//     private void compute(List<List<Integer>> res,  boolean []check, List<Integer>ds,int []nums)
//     {
//         if(ds.size()==nums.length )
//         {
//             res.add(new ArrayList<>(ds));
//             return;
//         }
//         for(int i=0;i<nums.length;i++)
//         {
//             if(check[i]) continue;
//             if(i>0 && nums[i]==nums[i-1] && !check[i-1]) continue;
//             if(!check[i])
//             {
//                  ds.add(nums[i]);
//                  check[i]=true;
//                 compute(res,check,ds,nums);
//                 ds.remove(ds.size()-1);
//                 check[i]=false;
//             }
          

//         }
//     }
// }













    public List<List<Integer>> permuteUnique(int[] nums) {


     List<List<Integer>>ans=new ArrayList<>();
     Arrays.sort(nums);
     
     boolean[] check=new boolean[nums.length];

     backtracking(nums,ans,new ArrayList<>(),check);


     return ans;  

    }


    public void backtracking(int[]nums,List<List<Integer>>ans,ArrayList<Integer>a, boolean[] check)
    {
        
        if(a.size()==nums.length)
        {
        ans.add(new ArrayList<>(a));
        return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1] && !check[i-1]) continue;
            if(!check[i])
            {
            a.add(nums[i]);
            check[i]=true;

            backtracking(nums,ans,a,check);

            a.remove(a.size()-1);
            check[i]=false;

            }
        }
    }
}













