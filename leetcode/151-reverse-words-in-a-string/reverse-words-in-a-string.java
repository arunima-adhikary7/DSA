class Solution {
    // public String reverseWords(String s) {

    //     StringBuilder str=new StringBuilder();
    //      String[] words=s.split("\\s+");
    //     //  for(int i=0;i<words.length;i++)
    //     //  {
    //     //     if(i>0)
    //     //     {
    //     //         str.insert(0," ");
    //     //     }
    //     //     str.insert(0,words[i]);

    //     //  }
    //     for(int i=words.length-1;i>=0;i--)
    //     {
    //         str.append(words[i]);

    //         // if(i>0)
    //         // {
    //         //     str.append(" ");
    //         // }
    //         str.append(" ");

    //     }
    //      return str.toString().trim();
        
    // }


        public String reverseWords(String s) {

        StringBuilder res=new StringBuilder();

       String[] words = s.trim().split("\\s+");
       for(String c :words)
       {
        res.insert(0,c+" ");

       }

        return res.toString().trim();
        }
}