// class Solution {
//     public String lexGreaterPermutation(String s, String target) {
//         StringBuilder ans=new StringBuilder();

//         char[] a=s.toCharArray();
//         return permute(a,0,target);
        
//     }
//     public static String permute(char arr[], int index,String target)
//     {
//         String ans="";
//         if(index==arr.length)
//         {
//            String current=new String(arr);
//            if(current.compareTo(target)>0)
//            {
//              return current; 
//            }
//            else
//            {
//            return "";
//            }
//         }
//         for(int i=index;i<arr.length;i++)
//         {
//             char temp=arr[index];
//             arr[index]=arr[i];
//             arr[i]=temp;

//            String result= permute(arr,index+1,target);
//            if(!result.equals(""))
//            {
//             if(ans.equals("") || result.compareTo(ans)<0)
//             {
//                  ans= result;
//             }
//            }

//             //undo

//             temp=arr[i];
//             arr[i]=arr[index];
//             arr[index]=temp;
//         }
//         return ans;
//     }
// }














class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int[] freq = new int[26];

        // Count characters of s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {

            int current = target.charAt(i) - 'a';

            // We can keep target[i] exactly
            if (freq[current] > 0) {
                freq[current]--;
                prefix.append(target.charAt(i));
            } 
            else {
                // target[i] is not available.
                // Try to put the smallest character greater than target[i].
                for (int c = current + 1; c < 26; c++) {

                    if (freq[c] > 0) {

                        StringBuilder ans = new StringBuilder(prefix);

                        ans.append((char) ('a' + c));
                        freq[c]--;

                        // Put remaining characters in sorted order
                        for (int x = 0; x < 26; x++) {
                            while (freq[x] > 0) {
                                ans.append((char) ('a' + x));
                                freq[x]--;
                            }
                        }

                        return ans.toString();
                    }
                }

                // No greater character here.
                // Go backwards and try to increase an earlier position.
                break;
            }
        }

        // target could not be followed completely,
        // or target itself used all characters.
        // Try increasing an earlier position.
        for (int i = prefix.length() - 1; i >= 0; i--) {

            int current = target.charAt(i) - 'a';

            // Put back the character we had used at position i
            freq[current]++;

            for (int c = current + 1; c < 26; c++) {

                if (freq[c] > 0) {

                    StringBuilder ans = new StringBuilder();

                    // Keep prefix before i
                    ans.append(target, 0, i);

                    // Make this position slightly bigger
                    ans.append((char) ('a' + c));
                    freq[c]--;

                    // Smallest possible suffix
                    for (int x = 0; x < 26; x++) {
                        while (freq[x] > 0) {
                            ans.append((char) ('a' + x));
                            freq[x]--;
                        }
                    }

                    return ans.toString();
                }
            }
        }

        return "";
    }
}









