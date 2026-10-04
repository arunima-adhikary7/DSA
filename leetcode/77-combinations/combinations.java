class Solution {
  
//          List<List<Integer>> res = new ArrayList<>();
//         backtracking(1, n, k, new ArrayList<>(), res);
//         return res;
        
//     }
//     private void backtracking(int s,int n,int k, List<Integer> path, List<List<Integer>> res)
//     {
//         if(path.size()==k)
//         {
//             res.add(new ArrayList<>(path));
//             return;
//         }
//         for(int i=s;i<=n;i++)
//         {
//           path.add(i);
//           backtracking(i+1,n,k, path, res);
//           path.remove(path.size()-1);
//         }
//     }
// }















  public List<List<Integer>> combine(int n, int k) {


   List<List<Integer>> ans=new ArrayList<>();

   backtrack(n,k,ans,new ArrayList<>(),1);


   return ans;

  }

  public  void backtrack(int n, int k,List<List<Integer>> ans,ArrayList<Integer>a,int index)
  {
    if(a.size()==k)
    {
        ans.add(new ArrayList<>(a));
        //a is the current temporary list, and I modify it during backtracking. So I store a copy of it in ans to preserve that particular subset before a changes again.
    }
      
      for(int i=index;i<=n;i++)
      {

        //add
        a.add(i);
       
       //all possible path

       backtrack(n,k,ans,a,i+1);

       //
       a.remove(a.size()-1);

      }
  }


}







