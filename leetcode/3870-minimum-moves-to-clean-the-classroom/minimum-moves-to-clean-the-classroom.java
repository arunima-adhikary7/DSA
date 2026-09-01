import java.util.*;

class Solution {

    class State {
        int r;
        int c;
        int energy;
        int mask;

        State(int r, int c, int energy, int mask) {
            this.r = r;
            this.c = c;
            this.energy = energy;
            this.mask = mask;
        }
    }

    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;        // rows
        int n = classroom[0].length();   // columns

        int row_count = 0;
        int col_count = 0;

        int litter_count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // Find S and L
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (classroom[i].charAt(j) == 'S') {
                    row_count = i;
                    col_count = j;
                }

                if (classroom[i].charAt(j) == 'L') {
                    map.put(i * n + j, litter_count);
                    litter_count++;
                }
            }
        }

        // No litter
        if (litter_count == 0) {
            return 0;
        }

        // Example:
        // litter_count = 3
        // allMask = 111
        int allMask = (1 << litter_count) - 1;

        Queue<State> queue = new LinkedList<>();

        // Starting state
        queue.offer(
            new State(row_count, col_count, energy, 0)
        );

        // visited[row][col][energy][mask]
        boolean[][][][] visited =
            new boolean[m][n][energy + 1][1 << litter_count];

        visited[row_count][col_count][energy][0] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int moves = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // One BFS level
            for (int i = 0; i < size; i++) {

                State current = queue.poll();

                // All litter collected
                if (current.mask == allMask) {
                    return moves;
                }

                // Try 4 directions
                for (int d = 0; d < 4; d++) {

                    int nr = current.r + dr[d];
                    int nc = current.c + dc[d];

                    // Outside grid
                    if (nr < 0 || nr >= m ||
                        nc < 0 || nc >= n) {
                        continue;
                    }

                    // Obstacle
                    if (classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }

                    // No energy
                    if (current.energy == 0) {
                        continue;
                    }

                    // Moving costs 1 energy
                    int newEnergy = current.energy - 1;

                    // Initially keep same mask
                    int newMask = current.mask;

                    char cell = classroom[nr].charAt(nc);

                    // Reset area
                    if (cell == 'R') {
                        newEnergy = energy;
                    }

                    // Check if this cell contains litter
                    int key = nr * n + nc;

                    if (map.containsKey(key)) {

                        int index = map.get(key);

                        newMask =
                            newMask | (1 << index);
                    }

                    // Already visited?
                    if (visited[nr][nc][newEnergy][newMask]) {
                        continue;
                    }

                    // Mark visited
                    visited[nr][nc][newEnergy][newMask] = true;

                    // Add to BFS
                    queue.offer(
                        new State(
                            nr,
                            nc,
                            newEnergy,
                            newMask
                        )
                    );
                }
            }

            moves++;
        }

        return -1;
    }
}