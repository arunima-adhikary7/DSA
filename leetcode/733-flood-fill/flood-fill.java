class Solution {
    
     
        // int originalc = image[sr][sc];
      
        //         if(originalc==color) return image;
        //         dfs(image,sr,sc,originalc,color);
        //         return image;
        //     }
        //         public void dfs(int[][] image, int i, int j, int originalColor, int newColor) {
        // if (i < 0 || j < 0 || i >= image.length || j >= image[0].length)
        //     return;

     
        // if (image[i][j] != originalColor)
        //     return;

        // // paint current cell
        // image[i][j] = newColor;

        // dfs(image, i + 1, j, originalColor, newColor);
        // dfs(image, i - 1, j, originalColor, newColor);
        // dfs(image, i, j + 1, originalColor, newColor);
        // dfs(image, i, j - 1, originalColor, newColor);





        // public int[][] floodFill(int[][] image, int sr, int sc, int color) {

         
        //     int iniColor=image[sr][sc];
        //     int [][] ans=image;
        //     int[] delrow={-1,0,1,0};
        //     int[] delcol={0,1,0,-1};
        //     dfs(image,sr,sc,ans,color,iniColor,delrow,delcol);
        //     return ans;
             
        //         }
        //         private void dfs(int[][] image,int sr,int sc,int[][] ans,int color,int iniColor,int[] delrow,int[] delcol)
        //         {
        //             ans[sr][sc]=color;
        //             int n=image.length;
        //             int m=image[0].length;
        //             for(int i=0;i<4;i++)
        //             {
        //                 int n_sr=sr+delrow[i];
        //                 int n_sc=sc+delcol[i];
                     
        //              if(n_sr>=0 && n_sc>=0 && n_sr<n && n_sc<m
        //              && image[n_sr][n_sc]==iniColor && ans[n_sr][n_sc]!=color)
        //              {
        //                 dfs(image,n_sr,n_sc,ans,color,iniColor,delrow,delcol);
        //              }

        //             }

        //         }
        // }
        



         public int[][] floodFill(int[][] image, int sr, int sc, int color) {
             
             int n=image.length;
             int m=image[0].length;
             boolean[][] vis=new boolean[n][m];

              int[][] ans=image;


             dfs(image,sr,sc,color,vis,n,m,ans);
             return ans;





        }

        public static void dfs(int[][] image, int sr, int sc, int color,boolean [][]vis,int n,int m,int[][] ans)
        {
            int ini=image[sr][sc];
            ans[sr][sc]=color;
            int[] row={-1,0,1,0};
             int[] col={0,1,0,-1};

            for(int i=0;i<4;i++)
            {
                int nrow=sr+row[i];
                int ncol=sc+col[i];
                if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && !vis[nrow][ncol] && image[nrow][ncol]==ini && ans[nrow][ncol]!=color )
                {
                 dfs(image,nrow,ncol,color,vis,n,m,ans);

                }
            }

        }
        
         }
