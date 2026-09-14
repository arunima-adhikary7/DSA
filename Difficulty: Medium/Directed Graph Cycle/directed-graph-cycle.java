class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        
        int[] vis=new int[V];
        int[] pathvis=new int[V];
        
        
        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Convert edges into adjacency list
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
        
        for(int i=0;i<V;i++)
        {
            if(vis[i]==0)
            {
            if(dfs(i,V,vis,pathvis,adj)==true) return true;
            }
           
        }
        return false;
    }
    
    public static boolean dfs(int i,int V,int[]vis,int[]pathvis,ArrayList<ArrayList<Integer>> adj)
    {
        vis[i]=1;
        pathvis[i]=1;
        for(int node : adj.get(i))
        {
            if(vis[node]==1 && pathvis[node]==1)
            {
                return true;
            }
            if(vis[node]==0)
            {
                if(dfs(node,V,vis,pathvis,adj)==true)
                {
                    return true;
                }
            }
           
        }
         pathvis[i]=0;
            return false;
    }
}
