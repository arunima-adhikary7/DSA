// class Solution {
//     public int characterReplacement(String s, int k) {
//         HashMap<Character, Integer> map = new HashMap<>();

//         int left = 0;
//         int maxFreq = 0;
//         int maxLen = 0;

//         for (int right = 0; right < s.length(); right++) {
            
//             char ch = s.charAt(right);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);

//             // find most frequent character
//             maxFreq = Math.max(maxFreq, map.get(ch));

//             // check if replacements needed > k
//             while ((right - left + 1) - maxFreq > k) {
//                 char leftChar = s.charAt(left);
//                 map.put(leftChar, map.get(leftChar) - 1);
//                 left++;
//             }

//             maxLen = Math.max(maxLen, right - left + 1);
//         }

//         return maxLen;
//     }
// }



//         int[] freq = new int[26];

//         int left = 0;
//         int maxFreq = 0;
//         int maxLen = 0;
//         for (int right = 0; right < s.length(); right++) {
            
//             char ch = s.charAt(right);
//             freq[ch - 'A']++;

//             // update max frequency
//             maxFreq = Math.max(maxFreq, freq[ch - 'A']);

//             // shrink window if invalid
//             if ((right - left + 1) - maxFreq > k) {
//                 freq[s.charAt(left) - 'A']--;
//                 left++; }
// maxLen = Math.max(maxLen, right - left + 1);}
//          return maxLen; }
     

//  static {
//         Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//             try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
//                 fw.write("0");
//             } catch (Exception e) {
//             }
//         }));}
// }



// class Solution {
//     public int characterReplacement(String s, int k) {

//       int[] frq=new int[26];
//       int maxfreq=0;
//       int left=0;
//       int maxlength=0;
//      for(int i=0;i<s.length();i++)
//      {
//         char ch=s.charAt(i);
//         frq[ch -'A']++;
//         maxfreq=Math.max(maxfreq,frq[ch -'A']);
//         if(((i-left+1)-maxfreq)>k)
//         {
//             frq[s.charAt(left)-'A']--;
//             left++;
//         }
//         maxlength=Math.max(maxlength,i-left+1);

//      }



//       return maxlength;
//     }
// }















class Solution
{
 public int characterReplacement(String s, int k) {

    int[] store=new int[26];
    int maxfreq=Integer.MIN_VALUE;
    int left=0;
    int maxlength=0;

    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        store[ch-'A']++;
        maxfreq=Math.max(maxfreq,store[ch-'A']);
        if(((i-left+1)-maxfreq)>k)
        {
            store[s.charAt(left)-'A']--;
            left++;
        }
        maxlength=Math.max(maxlength,i-left+1);

    }



   return maxlength;
 }

}












