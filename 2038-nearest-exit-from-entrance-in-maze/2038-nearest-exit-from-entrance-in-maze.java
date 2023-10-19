class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] visited = new boolean[m][n];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1]});
        visited[entrance[0]][entrance[1]] = true;
        
        int steps = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            steps++;
            
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                
                for (int[] dir : directions) {
                    int newX = x + dir[0];
                    int newY = y + dir[1];
                    
                    if (newX >= 0 && newX < m && newY >= 0 && newY < n && maze[newX][newY] == '.' && !visited[newX][newY]) {
                        if (newX == 0 || newX == m - 1 || newY == 0 || newY == n - 1) {
                            return steps;  // Found the nearest exit.
                        }
                        
                        queue.offer(new int[]{newX, newY});
                        visited[newX][newY] = true;
                    }
                }
            }
        }
        
        return -1;  // No exit found.
    }
}

