class Solution {
       
    //    int count=0;
    //     int n=grid.length;
    //     int m=grid[0].length;
    //     int[][] vis=new int[n][m];

    //   //first and last row
    //     for(int i=0;i<m;i++)//all column
    //     {
    //         if(vis[0][i]==0 && grid[0][i]==1)
    //         {
    //             dfs(0,i,vis,grid);
    //         }
    //          if(vis[n-1][i]==0 && grid[n-1][i]==1)
    //         {
    //             dfs(n-1,i,vis,grid);
    //         }
            
    //     }

    //      for(int j=0;j<n;j++)//for all rows
    //     {
    //         if(vis[j][0]==0 && grid[j][0]==1)//all rows first column
    //         {
    //             dfs(j,0,vis,grid);
    //         }
    //          if(vis[j][m-1]==0 && grid[j][m-1]==1)// all row last column
    //         {
    //             dfs(j,m-1,vis,grid);
    //         }
            
    //     }
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<m;j++)
    //         {
    //              if(vis[i][j]!=1 && grid[i][j]==1)
    //              {
    //                    count++;
    //                    vis[i][j]=1;
    //              }
                
    //         }
    //     }
    //     return count;
        
    // }

    // private void dfs(int row,int col,int[][]vis,int[][] grid)
    // {
    //     vis[row][col]=1;
    //      int n=grid.length;
    //     int m=grid[0].length;

    //     int[] delrow={-1,0,1,0};
    //     int[] delcol={0,1,0,-1};
    //     for(int i=0;i<4;i++)
    //     {
    //         int nrow=row+delrow[i];
    //         int ncol=col+delcol[i];

    //          if(nrow>=0 && ncol>=0 &&
    //            nrow<n && ncol<m &&
    //            vis[nrow][ncol]==0 &&
    //            grid[nrow][ncol]==1) {

    //              dfs(nrow,ncol,vis,grid);
    //            }



    //     }

    // }

        public int numEnclaves(int[][] grid) {


        int n=grid.length;
        int m=grid[0].length;

        int count=0;

        int [][] vis=new int[n][m];

        for(int i=0;i<m;i++)//for all column of first and last row
        {
            if(vis[0][i]==0 && grid[0][i]==1)
            {
                dfs(0,i,vis,grid);

            }
            if(vis[n-1][i]==0 && grid[n-1][i]==1)
            {
                dfs(n-1,i,vis,grid);
            }
        }

        for(int i=0;i<n;i++)//every rows' first and last col
        {
            if(vis[i][0]==0 && grid[i][0]==1)
            {
                dfs(i,0,vis,grid);
            }

            if(vis[i][m-1]!=1 && grid[i][m-1]==1)
            {
                dfs(i,m-1,vis,grid);
            }
        }
    

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(vis[i][j]!=1 && grid[i][j]==1)
            {
                count++;
            }
        }
    }
    return count;
}

public static void dfs(int row, int col,int[][]vis,int[][]grid)
{
    vis[row][col]=1;
    int n=grid.length;
     int m=grid[0].length;

        int[] ro={-1,0,1,0};
        int[] co={0,1,0,-1};

        for(int i=0;i<4;i++)
        {
            int r=ro[i]+row;
            int c=co[i]+col;
            if(r>=0 && c>=0 && r<n && c<m && vis[r][c]!=1 && grid[r][c]==1)
            {
                dfs(r,c,vis,grid);
            }
        }
}
}