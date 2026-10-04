class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

      List<List<Integer>>ans=new ArrayList<>();
      Arrays.sort(nums);

     backtracking(nums,0,new ArrayList<>(),ans);
      return ans;   
        
    }
    public void backtracking(int[] nums,int index,ArrayList<Integer>a,List<List<Integer>>ans)
    {
        // if(!ans.contains(a))
        // {
            ans.add(new ArrayList<>(a));
        // }

        for(int i=index;i<nums.length;i++)
        {
            if(i>index && nums[i]==nums[i-1])
            {
                continue;
            }
            a.add(nums[i]);

           backtracking(nums,i+1,a,ans);

           a.remove(a.size()-1);


        }
    }
}