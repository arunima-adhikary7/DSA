// import java.util.*;


//     public int[][] merge(int[][] arr) {
//         Arrays.sort(arr, (a, b) -> a[0] - b[0]);
//         List<int[]> res = new ArrayList<>();

//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i][1] >= arr[i + 1][0]) {
//                 // merge and update next
//                 arr[i + 1][0] = arr[i][0];
//                 arr[i + 1][1] = Math.max(arr[i][1], arr[i + 1][1]);
//             } else {
//                 // no overlap → add current
//                 res.add(arr[i]);
//             }
//         }

//         res.add(arr[arr.length - 1]); // last interval
//         return res.toArray(new int[res.size()][]);
//     }
// }

class Solution 
{
public int[][] merge(int[][]arr)
{
    Arrays.sort(arr,(a,b)->a[0]-b[0]);
    ArrayList<int[]>res=new ArrayList<>();


for(int i=0;i<arr.length-1;i++)
{
    if(arr[i][1]>=arr[i+1][0])
    {
        arr[i+1][0]=arr[i][0];
        arr[i+1][1]=Math.max(arr[i][1],arr[i+1][1]);
    }
    else
    {
        res.add(arr[i]);

    }
   
}
 res.add(arr[arr.length-1]);

    return res.toArray(new int[res.size()][]);


}
}