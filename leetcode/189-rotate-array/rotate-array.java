    // public void rotate(int[] nums, int k) {

    //     int n = nums.length;

    //     // Handle cases where k > n
    //     k = k % n;

    //     reverse(nums, 0, n - 1);
    //     reverse(nums, 0, k - 1);
    //     reverse(nums, k, n - 1);
    // }

    // private void reverse(int[] nums, int start, int end) {

    //     while (start < end) {

    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;

    //         start++;
    //         end--;
    //     }





//   public void rotate(int[] nums, int k) {

//     int n = nums.length;
//         if (n == 0) {
//             return;
//         }
//     k = k % n;

//     for (int r = 0; r < k; r++) {

//         int last = nums[n - 1];

//         for (int i = n - 1; i > 0; i--) {
//             nums[i] = nums[i - 1];
//         }

//         nums[0] = last;
//     }
// }
// }










class Solution {


public void rotate(int[] nums, int k) {

  int n=nums.length;
  int mid=0;
  k=k%n;
  rev(nums,0,n-1);


rev(nums,0,k-1);
rev(nums,k,n-1);





}

public static void rev(int nums[],int s,int n)
{

while(s<n)
{
    int temp=nums[s];
    nums[s]=nums[n];
    nums[n]=temp;
    s++;
    n--;
}

}






}




