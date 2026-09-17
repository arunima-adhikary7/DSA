class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {

      Queue<Integer>q=new LinkedList<>();

       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

         // Build graph
        for (int[] edge : dislikes) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

         int[] color = new int[n + 1];

        for (int i = 1; i <= n; i++) {
             if (color[i] == 0) {


                q.add(i);
                color[i] = 1;


            while(!q.isEmpty())
            {
                int node=q.poll();
                for(int it:adj.get(node))
                {
                    if(color[it]==color[node])
                    {
                        return false;
                    }
                    if(color[it]==0)
                    {
                        color[it]=3-color[node];
                        q.add(it);
                    }

                }
            }




        }
        }
        return true;
        
    }
}