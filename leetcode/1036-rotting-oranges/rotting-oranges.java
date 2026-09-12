class Solution {
    // public int orangesRotting(int[][] grid) {
    //     int m=grid.length;
    //     int n=grid[0].length;
    //     int count_m=0;
    //     int fresh=0;
    //     Queue<int[]>q=new LinkedList<>();
    //     for(int i=0;i<m;i++)
    //     {
    //         for(int j=0;j<n;j++)
    //         {
    //             if(grid[i][j]==2)
    //             {
    //                 //rotten
    //                 //check for 4 dimension
    //                  q.offer(new int[]{i, j});
                   
    //             }
    //               else if(grid[i][j] == 1) {
    //                 fresh++;
    //             }
    //         }
    //     }

    //              int[] row = {-1, 1, 0, 0};
    //           int[] col = {0, 0, -1, 1};
    //             while(!q.isEmpty())
    //             {
    //                 int size=q.size();
    //                 boolean rotten = false;
    //                 for(int i=0;i<size;i++)
    //             {
    //                 //check the 4 directions
    //                 int[] curr=q.poll();
    //                 int r=curr[0];
    //                 int c=curr[1];
    //                 for(int d=0;d<4;d++)
    //                 {
    //                 int nr = r + row[d];
    //                 int nc = c + col[d];
    //                 if(nr >= 0 && nc >= 0 && nr < m && nc < n 
    //                    && grid[nr][nc] == 1) {

    //                     grid[nr][nc]=2;
    //                     q.offer(new int[]{nr, nc});
    //                     fresh--;
    //                    rotten = true;
    //                    }

    //                 }
                
    //              }
    //               if(rotten) {
    //             count_m++;
    //         }
                   
    //             }
    //               if(fresh > 0) return -1;

    //           return count_m;
    //         }







public int orangesRotting(int[][] grid) {

    int m = grid.length;
    int n = grid[0].length;

    Queue<int[]> q = new LinkedList<>();

    int fresh = 0;

    boolean[][] visited = new boolean[m][n];

    // Put all initially rotten oranges into queue
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {

            if(grid[i][j] == 2) {
                q.offer(new int[]{i, j, 0});
                visited[i][j] = true;
            }
            else if(grid[i][j] == 1) {
                fresh++;
            }
        }
    }

    int[] row = {-1, 1, 0, 0};
    int[] col = {0, 0, -1, 1};

    int minutes = 0;

    while(!q.isEmpty()) {

        int[] curr = q.poll();

        int r = curr[0];
        int c = curr[1];
        int time = curr[2];

        minutes = Math.max(minutes, time);

        // Check 4 directions
        for(int d = 0; d < 4; d++) {

            int nr = r + row[d];
            int nc = c + col[d];

            if(nr >= 0 && nc >= 0 &&
               nr < m && nc < n &&
               grid[nr][nc] == 1 &&
               !visited[nr][nc]) {

                visited[nr][nc] = true;

                grid[nr][nc] = 2;

                q.offer(new int[]{nr, nc, time + 1});

                fresh--;
            }
        }
    }

    if(fresh > 0) {
        return -1;
    }

    return minutes;
}
}