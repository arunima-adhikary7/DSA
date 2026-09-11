class Solution {
    // int count=0;
   

    //  boolean[] visited=new boolean[isConnected.length];
    
    // for(int i=0;i<isConnected.length;i++)
    // {
    //     if(!visited[i])
    //     {
    //      dfs(isConnected,visited,i);
    //         count++;
    //     }
    // }
  
    //  return count;
        
    // }
    // private void dfs(int[][] isConnected,boolean[] visited, int node)
    // {
        
    //      visited[node]=true;
       
    //      for(int i=0;i<isConnected.length;i++)
    //      {
    //         if(isConnected[node][i]==1 && !visited[i])
    //            dfs(isConnected,visited,i);
    //      }
    // }









int count=0;
     public int findCircleNum(int[][] isConnected) {


       boolean vis[]=new boolean[isConnected.length];

        // Find every new province

        for(int i=0;i<isConnected.length;i++)
        {
            if(!vis[i])
            {
                dfs(isConnected,vis,i);
                count++;
            }

        }

  return count;


     }

     private void dfs(int[][] isConnected,boolean[] vis, int node)
     {
         // Current city is visited
        vis[node]=true;
          // Find all neighbors of current city
        for(int i=0;i<isConnected.length;i++)
        {
            if(isConnected[node][i]==1 && !vis[i])
            {
                // Go deeper into that neighbor

                dfs(isConnected,vis,i);
            }
        }

     }
     
}