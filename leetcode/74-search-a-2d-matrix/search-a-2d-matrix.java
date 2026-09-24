class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n=matrix.length;
        int m=matrix[0].length;

        
        
       

        // for(int i=0;i<n;i++)
        // {

            int left=0;
            // int right=m-1;

            int right=n*m-1;


            


            while(left<=right)
            {
                int mid=(left+right)/2;
                  int row = mid / m;
                   int col = mid % m;

                if(matrix[row][col]==target) return true;
                 
                if(matrix[row][col]>target)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }


            }
        

        
        
         return false;
    }
}