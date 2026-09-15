package Graph;

public class Bipartite {

    public  boolean isbiparite(int[][] graph)
    {
        int n=graph.length;

        int[] vis=new int[n];
        int[] color=new int[n];

        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
            {
                if(dfs(graph,vis,color,i,0)==false)
                {
                    return false;
                }

            }
        }
        return true;

    }
    public boolean dfs(int[][] graph, int[] vis, int[] color, int node, int col)
    
    {
       vis[node]=1;
       
       color[node]=col;
       for(int it:graph[node])
       {
           if(vis[it]==0)
           {
             if(dfs(graph,vis,color,it,1-col)==false)
             {
                 return false;
             }
           }
           else if(color[it]==col)
           {
              return false;
           }
       }
       return true;
    }

    public static void main(String[] args)
    {
        int[][] graph={
            {1,2,3},
            {0,2},
            {0,1,3},
            {0,2}
        };
        
       Bipartite obj=new Bipartite();
        boolean ans=obj.isbiparite(graph);
        System.out.println(ans);
    }
    
}
