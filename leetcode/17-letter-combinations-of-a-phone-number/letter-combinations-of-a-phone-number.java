class Solution {
    public List<String> letterCombinations(String digits) {

        HashMap<String,String>map=new HashMap<>();

        map.put("2","abc");
       map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9", "wxyz");

    List<String> ans=new ArrayList<>();

    backtracking(map,ans,0,digits,new StringBuilder());

    return ans; 

        
    }
    public void backtracking(HashMap<String,String>map,List<String> ans,int index,String digits,StringBuilder a)
    {
        if(index==digits.length())
        {
          ans.add(a.toString());
         return;
        }

        String letters=map.get(String.valueOf(digits.charAt(index)));
        for(int i=0;i<letters.length();i++)
        {
          a.append(letters.charAt(i));

        backtracking(map, ans, index + 1, digits, a);
          a.deleteCharAt(a.length()-1);
        }
    }
}