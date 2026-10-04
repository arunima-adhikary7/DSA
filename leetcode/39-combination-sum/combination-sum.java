class Solution {
//         List<List<Integer>> ans= new ArrayList<>();
//         calculate(0,target,candidates,ans,new ArrayList<>());
//         return ans;
//     }
//     private void calculate(int idx,int target,int[] arr,List<List<Integer>> ans,List<Integer>ds)
//     {
//         if(idx==arr.length)
//         {
//             if(target==0)
//             {
//                 ans.add(new ArrayList<>(ds));//Because ds keeps changing, and we need to store a copy, not the original.
//             }
//             return ;
//         }
//         if(arr[idx]<=target)
//         {
//             ds.add(arr[idx]);
//            calculate(idx,target-arr[idx],arr,ans,ds);
//            ds.remove(ds.size()-1);
//         }
//          calculate(idx+1,target,arr,ans,ds);
//     }
// }












   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       
        List<List<Integer>> ans=new ArrayList<>();
        backtracking(candidates,target,ans,new ArrayList<>(),0);

        return ans;

    }

    public void backtracking(int[] candidates, int target, List<List<Integer>> ans,ArrayList<Integer>a,int index)
    {
             int sum=0;
        for(int x:a)
        {
       
            sum+=x;
         

        }
        if(sum==target)
        {
            ans.add(new ArrayList<>(a));
               return;
        }
        if(sum>target)
        {
            return;
        }

        for(int i=index;i<candidates.length;i++)
        {
            a.add(candidates[i]);

         backtracking( candidates,target, ans,a,i);
        //  In **Combination Sum**, our goal is to find combinations whose sum is equal to the target. The order does not matter, so `[2,2,3]` and `[3,2,2]` should not be treated as different answers. Also, we are allowed to **use the same number multiple times**. That is why we use an `index`. When we choose `candidates[i]`, we call the next recursion with the **same `i`**, not `i + 1`. Using the same `i` means the current number can be selected again. For example, if we choose `2`, we can choose `2` again and get `[2,2]`. At the same time, starting the loop from `index` instead of `0` prevents us from going backward and creating duplicate orders such as `[2,3,2]` or `[3,2,2]`. We also stop the recursion when the sum becomes equal to the target because we have found a valid combination, and we stop when the sum becomes greater than the target because all numbers are positive, so adding more numbers cannot bring the sum back down. The basic pattern is **choose → explore → undo**, and the important rule for Combination Sum is: **use `i` when recursing because elements can be reused, while starting the loop from `index` prevents duplicate combinations.**


          a.remove(a.size()-1);

        }
        
    } 

}