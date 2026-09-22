class Solution {
        // if(n<=3)
        //     return n;
        // int a = 1, b = 2;
        // for(int i=3;i<=n;i++){
        //     int c =a+b;
        //     a=b;
        //     b=c;
        // }
        // return b;








    public int climbStairs(int n) {

     //TLE
    //  if(n==0 || n==1) return 1;
     


    
    // return climbStairs(n-2)+climbStairs(n-1);


     int [] dp=new int[n+1];
     Arrays.fill(dp,-1);

     return solve(n,dp);
     

        
    }
    public static int solve(int n,int dp[])
    {
         if(n==0 || n==1) return 1;

         if(dp[n]!=-1)
         {
            return dp[n];
         }
         dp[n]=solve(n-1,dp)+solve(n-2,dp);

         return dp[n];

    }

}