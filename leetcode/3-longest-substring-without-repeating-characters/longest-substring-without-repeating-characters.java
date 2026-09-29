
           //We use a HashSet when we want to store unique elements and need fast operations (add, remove, search).  
    //  HashSet<Character>set=new HashSet<>();
    //  int left=0;
    //  int maxLen=0;
    //  for(int i=0;i<s.length();i++)
    //  {
    //     while(set.contains(s.charAt(i)))
    //     {
    //         set.remove(s.charAt(left));
    //         left++;
    //     }
    //     set.add(s.charAt(i));
    //     maxLen=Math.max(maxLen,i-left+1);//length = end - start + 1

    //  }
    //  return maxLen;




//    HashSet<Character>set=new HashSet<>();
//    int left=0;
//    int maxlength=0;
//    for(int i=0;i<s.length();i++)
//    {
//     Character ch=s.charAt(i);

//     while(set.contains(ch))
//     {
//         set.remove(s.charAt(left));
//         left++;
//     }
//     set.add(s.charAt(i));
//     maxlength=Math.max(maxlength,i-left+1);
//    }
//     return maxlength;
   





     
//      HashSet<Character>set=new HashSet<>();
// int left=0;
// int maxLen=0;
//      for(int i=0;i<s.length();i++)
//      {
//         while(set.contains(s.charAt(i)))
//         {
//             set.remove(s.charAt(left)); 
//             left++;
//         }
//                 set.add(s.charAt(i));
//                 maxLen=Math.max(maxLen,i-left+1);

               

//      }

//  return maxLen;
// HashSet<Character>set=new HashSet<>();
// int left=0;
// int maxlen=0;
// for(int i=0;i<s.length();i++)
// {
//    while(set.contains(s.charAt(i)))
//    {
//     set.remove(s.charAt(left));
//     left++;
//    }
//    set.add(s.charAt(i));
//    maxlen=Math.max(maxlen,i-left+1);

// }
// return maxlen;








//   HashSet<Character>set=new HashSet<>();
//   int left=0;
//   int maxsize=0;

//   for(int i=0;i<s.length();i++)
//   {
   

//     while(set.contains(s.charAt(i)))
//     {
//       set.remove(s.charAt(left));
//       left++;
//     }
//      set.add(s.charAt(i));
//     maxsize=Math.max(maxsize,i-left+1);

//   }      

//  return maxsize;





class Solution {
    public int lengthOfLongestSubstring(String s) {


 int[] freq=new int[128];
  int left=0;
  int maxlength=0;
  

  for(int right=0;right<s.length();right++)
  {
    char ch=s.charAt(right);
    freq[ch]++;

    while(freq[ch]>1)
    {
        freq[s.charAt(left)]--;
        left++;

    }
    maxlength=Math.max(maxlength,right-left+1);

  }

     return maxlength;



















    }}