class Solution {
   
        // List<List<Integer>> res = new ArrayList<>();
        // backtrack(0, nums, new ArrayList<>(), res);
        // return res;
    

//     private void backtrack(int start, int[] nums, List<Integer> path, List<List<Integer>> res) {
//         // add current subset
//         res.add(new ArrayList<>(path));

//         for (int i = start; i < nums.length; i++) {
//             path.add(nums[i]);                 // choose
//             backtrack(i + 1, nums, path, res); // explore
//             path.remove(path.size() - 1);      // backtrack
//         }
//     }
// }






//  class Solution {
// List<List<Integer>> ans = new ArrayList<>();
//     public List<List<Integer>> subsets(int[] nums) {
        
//         List<Integer> curr = new ArrayList<>();
//         helper(0,nums,curr);
//         return ans;
//     }
//     public void helper(int idx, int[] arr, List<Integer> curr){
//         if(idx>=arr.length){
//             ans.add(new ArrayList<>(curr));
//             return;
//         }
//         curr.add(arr[idx]);
//         helper(idx+1,arr,curr);
//         curr.remove(curr.size()-1);
//         helper(idx+1,arr,curr);
//     }
//  }
















 public List<List<Integer>> subsets(int[] nums) {

    List<List<Integer>>ans=new ArrayList<>();
    backtrack(nums,ans,0,new ArrayList<>());

    return ans;


 }

 public void backtrack(int[]nums, List<List<Integer>>ans,int index,List<Integer>a)
 {
    ans.add(new ArrayList<>(a));
    for(int i=index;i<nums.length;i++)
    {
        //add data
        //take  [1] -> [1,2]
        a.add(nums[i]);

        //recursion call [1,2] -> [1]
        backtrack(nums,ans,i+1,a);

        //not take it 
        a.remove(a.size()-1); //[1,2] -> [1]


    }
 }





}









