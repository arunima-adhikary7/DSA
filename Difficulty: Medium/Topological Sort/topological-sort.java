class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {

        int[] vis = new int[V];

        Stack<Integer> st = new Stack<>();

        ArrayList<Integer> ans = new ArrayList<>();

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Convert edge list to adjacency list
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }

        // DFS
        for(int i = 0; i < V; i++) {
            if(vis[i] == 0) {
                dfs(i, vis, st, adj);
            }
        }

        // Stack → answer
        while(!st.isEmpty()) {
            ans.add(st.pop());
        }

        return ans;
    }

    public static void dfs(
        int node,
        int[] vis,
        Stack<Integer> st,
        ArrayList<ArrayList<Integer>> adj)
    {
        vis[node] = 1;

        for(int neighbour : adj.get(node))
        {
            if(vis[neighbour] == 0)
            {
                dfs(neighbour, vis, st, adj);
            }
        }

        st.push(node);
    }
}