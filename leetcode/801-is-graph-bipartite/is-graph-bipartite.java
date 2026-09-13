class Solution {

//     public boolean isBipartite(int[][] graph) {

//         int n = graph.length;

//         int[] color = new int[n];
//         Arrays.fill(color, -1);

//         for(int i=0;i<n;i++)
//         {
//             if(color[i] == -1)
//             {
//                 if(!dfs(i, 0, graph, color))
//                 {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     private boolean dfs(int node,
//                         int col,
//                         int[][] graph,
//                         int[] color)
//     {
//         color[node] = col;

//         for(int adjNode : graph[node])
//         {
//             if(color[adjNode] == -1)
//             {
//                 if(!dfs(adjNode, 1-col, graph, color))
//                 {
//                     return false;
//                 }
//             }
//             else if(color[adjNode] == col)
//             {
//                 return false;
//             }
//         }

//         return true;
//     }
// }










public boolean isBipartite(int[][] graph) {


    Queue<Integer>q=new LinkedList<>();

    int n=graph.length;
    int m=graph[0].length;

   int[] vis=new int[n];
   Arrays.fill(vis,-1);

   for(int start=0;start<n;start++)
   {
        // If this node is already visited,
        // it belongs to an already checked component
        if (vis[start] != -1) {
            continue;
        }

   q.offer(start);
   vis[start]=0;
   while(!q.isEmpty())
   {
     int node=q.poll();
     for(int neighbor:graph[node])
     {
        if(vis[neighbor]==-1 )
        {
            
      
        vis[neighbor]=1-vis[node];
          q.offer(neighbor);
        
      
        }
        else
        {
            if(vis[neighbor]==vis[node])
            {
                return false;
            }
           
        }
     }
   }
   }

    return true;
 }
}















