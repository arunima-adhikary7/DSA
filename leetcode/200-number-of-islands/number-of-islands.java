class Pair{
    int row;
    int col;

    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    // int n,m;
    //  boolean[][] visited;
    // public int numIslands(char[][] grid) {
    //      m=grid.length;
    //      n=grid[0].length;

    //     visited = new boolean[m][n];
    //     int count=0;
    //     for(int i=0;i<m;i++)
    //     {
    //         for(int j=0;j<n;j++)
    //         {
    //             if(grid[i][j]=='1' && !visited[i][j])
    //             {
    //               count++;
    //               dfs(i,j,grid);
    //             }
    //         }
    //     }
    //     return count;
        
    // }
    // public void dfs(int i,int j,char[][] grid)
    // {
    //     if(i < 0 || j < 0 || i >= m || j >= n)
    //         return;
    //        if(grid[i][j] == '0')
    //         return;

    //      if (grid[i][j] == '0' || visited[i][j]) return;

    //     // mark visited
    //     visited[i][j] = true;

    //     dfs(i+1,j,grid);
    //     dfs(i-1,j,grid);
    //     dfs(i,j+1,grid);
    //     dfs(i,j-1,grid);

    // }



   
//    public int numIslands(char[][] grid) {

//     int n=grid.length;
//    int m=grid[0].length;
// int count=0;
//    int [][] visited=new int[n][m];

//    for(int i=0;i<n;i++)
//    {
//     for(int j=0;j<m;j++)
//     {
//         if(grid[i][j]=='1' && visited[i][j]==0)
//         {
//             count++;
//             BFS(grid,visited,i,j);
//         }
//     }
//    }


//      return count;
   

//    }

//    private void BFS(char[][] grid,int [][] visited,int row,int col)
//    {
//     Queue<Pair>q=new LinkedList<>();
//     visited[row][col]=1;
//     q.add(new Pair(row,col));
// int n=grid.length;
//    int m=grid[0].length;
//     while(!q.isEmpty())
//     {
//         int n_row=q.peek().row;
//         int n_col=q.peek().col;
//         q.remove();

//         //adding neighbors
       
//     //    for(int i=-1;i<=1;i++)
//     //    {
//     //      for(int j=-1;j<=1;j++)
//     //      {
//             int[] delrow = {-1,0,1,0};
//         int[] delcol = {0,1,0,-1};

//         for(int k=0;k<4;k++)
//         {
//             int our_row=n_row+ delrow[k];
//             int our_col=n_col+ delcol[k];
//             if(our_row>=0 && our_row<n && our_col>=0 && our_col<m && grid[our_row][our_col]=='1' && visited[our_row][our_col]==0 )
//                 {
//                   visited[our_row][our_col]=1;
//                   q.add(new Pair(our_row,our_col));

//                 }
//          }
//        }

//     }

//    }














  public int numIslands(char[][] grid)
  {

      int n=grid.length;
      int m=grid[0].length;
      boolean[][] vis=new boolean[n][m];
      Queue<int[]>q=new LinkedList<>();
       int count=0;

      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
            if(grid[i][j]=='1' && !vis[i][j] )
            {
               q.offer(new int[]{i,j});
               vis[i][j]=true;
               count++;
      

      int[] row={-1,1,0,0};
      int[] col={0,0,-1,1};

      while(!q.isEmpty())
      {
        int[] curr=q.poll();
        int r=curr[0];
        int c=curr[1];

        for(int d=0;d<4;d++)
        {
            int nr=r+row[d];
            int nc=c+col[d];
            if(nr>=0 && nc>=0 && nr<n && nc<m && !vis[nr][nc] && grid[nr][nc]=='1')
            {
                q.offer(new int[]{nr,nc});
                vis[nr][nc]=true;
            }
        }
      }
            }
        }
      }
  
    return count;
  }
}














