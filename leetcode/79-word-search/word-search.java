class Solution {

//        for(int i=0;i<board.length;i++)
//        {
//         for(int j=0;j<board[0].length;j++)
//         {
//             if(dfs(board,word,i,j,0))
//             {
//                 return true;
//             }
//         }
//        } 
//        return false;
        
//     }
//     private boolean dfs(char[][] board,String word,int i,int j,int index)
//     {
//          if(index==word.length()) return true;
        
        
           
//             if(i < 0 || j < 0 ||
//            i >= board.length ||
//            j >= board[0].length ||board[i][j]!= word.charAt(index))
//             {
//                 return false;
//             }
//             //mark visited
//             char temp=board[i][j];
//             board[i][j]='#';

        
//         //horizontal vertical
//         boolean found=
//         dfs(board,word,i+1,j,index+1)||
//         dfs(board,word,i-1,j ,index+1)||
//         dfs(board,word,i,j-1,index+1)||
//         dfs(board,word,i,j+1,index+1);
         
//          //backtrack
//         board[i][j]=temp;
// S


//     return found;
//     }
// }








    public boolean exist(char[][] board, String word) {

   int n=board.length;
    int m=board[0].length;
    boolean[][] check = new boolean[n][m];    


     for(int i=0;i<n;i++)
     {
        for(int j=0;j<m;j++)
        {
            if(dfs(i,j,board,check,word,0))
            {
                return true;
            }
        }
     }

      return false;


    }

    public boolean dfs(int i,int j,char[][] board,boolean[][] check,String word,int index)
    {
        if(index==word.length())
        {
            return true;
        }

        
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || check[i][j] || word.charAt(index)!=board[i][j])
        {
            return false;
        }

        //take
         check[i][j]=true;

         //explore
         int[] r = {-1, 1, 0, 0};
         int[] c = {0, 0, -1, 1};
            for(int k=0;k<4;k++)
            {
            int nr=i+r[k];
            int nc=j+c[k];
            if(dfs(nr,nc,board,check,word,index+1))
            {
                return true;
            }
            }
            
            //undo
            check[i][j]=false;


            return false;
       
    }

}










