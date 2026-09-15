package Graph;

import java.util.ArrayList;

public class Cycle_undirected {


    public boolean isCycle(int v,   ArrayList<ArrayList<Integer>> adj)
    {

        int[] vis=new int[v];

        for(int i=0;i<v;i++)
        {
            if(vis[i]==0)
            {
                if(dfs(i,-1,adj,vis)==false)
                {
                    return  false;
                }
            }

        }
        return true;
    }

    public boolean dfs(int node ,int parent,ArrayList<ArrayList<Integer>> adj,int[] vis)
    {
        vis[node]=1;
        for(int it:adj.get(node))
        {
            if(vis[it]==0)
            {
                if(dfs(it,node,adj,vis)==false)
                {
                    return false;
                }
            }
            else if(it!=parent)
            {
                return false;
            }
                
            }

        
        return true;
    }

    

    public static void main(String[] args) { 
        int V = 5;
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
          // Create empty list for every vertex 
          for (int i = 0; i < V; i++) { adj.add(new ArrayList<>()); } 
          // Add edges 
          adj.get(0).add(1); 
          adj.get(1).add(0);
           adj.get(1).add(2);
            adj.get(2).add(1); 
            adj.get(2).add(3); 
            adj.get(3).add(2);
             adj.get(3).add(0); 
             adj.get(0).add(3); 
             // Check cycle 
             Cycle_undirected obj=new Cycle_undirected();
             if (obj.isCycle(V, adj))
                 {
                     System.out.println("Cycle exists"); 
                  } 
             else 
                { 
                    System.out.println("No cycle");
                 }


    }
    
}
