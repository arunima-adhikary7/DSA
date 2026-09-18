class Solution {
     //   ArrayList<Integer> ar = new ArrayList<>();
     
        // int start = 0;
        // int s2 = 0;
        // while (start < m && s2 < n) {
        //     if (nums1[start] < nums2[s2]) {

        //         ar.add(nums1[start]);
        //         start++;
        //     } else if (nums1[start] == nums2[s2]) {
        //         ar.add(nums1[start]);
        //         ar.add(nums2[s2]);
        //         start++;
        //         s2++;
        //     } else {
        //         ar.add(nums2[s2]);
        //         s2++;

        //     }

        // }
        // while (start < m) {
        //     ar.add(nums1[start]);
        //     start++;
        // }
        // while (s2 < n) {
        //     ar.add(nums2[s2]);
        //     s2++;
        // }
        // for (int i = 0; i < ar.size(); i++) {
        //     nums1[i] = ar.get(i);
        // }



//         int i = m - 1;
// int j = n - 1;
// int k = m + n - 1;

// while (i >= 0 && j >= 0) {
//     if (nums1[i] > nums2[j]) {
//         nums1[k] = nums1[i];
//         i--;
//     } else {
//         nums1[k] = nums2[j];
//         j--;
//     }
//     k--;
// }

// while (j >= 0) {
//     nums1[k] = nums2[j];
//     j--;
//     k--;
// }
//     }

//TC O(m+n)
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int j=n-1;
//         int i=m-1;
//         int k=m+n-1;

//         while(i>=0 && j>=0)
//         {
//             if(nums1[i]>nums2[j])
//             {
//                 nums1[k]=nums1[i];
//                 i--;
//             }
//             else
//             {
//                 nums1[k]=nums2[j];
//                 j--;
//             }
//             k--;
//         }
//         while(j>=0)
//         {
//             nums1[k]=nums2[j];
//             j--;
//             k--;
//         }


//     }

// }





 public void merge(int[] nums1, int m, int[] nums2, int n)

{ 


    int i=m-1;
    int j=n-1;
    int k=m+n-1;

    while(i>=0 && j>=0)
    {
        if(nums1[i]>nums2[j])
        {

          nums1[k]=nums1[i];
          i--;
        }
        else
        {
            nums1[k]=nums2[j];
            j--;

        }
        k--;
    }
     
     
     while(j>=0)
     {
        nums1[k]=nums2[j];
        j--;
        k--;

     }

 }

}








