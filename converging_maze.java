public class converging_maze {
    public static void main(String[] args) {
        int n = 5;
        int maze[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = 1;
            }
        }
        int startX = 0;
        int startY = 0;
        int endX = n - 1;
        int endY = n - 1;
        maze[startX][startY] = 0;
        maze[endX][endY] = 0;
        int dx[] = { -1, 0, 1, 0 };
        int dy[] = { 0, 1, 0, -1 };
        boolean[][] visited = new boolean[n][n];
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = false;
            }
        }
        dfs(maze, startX, startY, visited, dx, dy, found, endX, endY);
        System.out.println("Converging maze:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static boolean dfs(int[][] maze, int x, int y, boolean[][] visited, int[] dx, int[] dy, boolean found, int endX, int endY) {
        if (x == endX && y == endY) {
            found = true;
            return true;
        }
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (isValid(maze, newX, newY, visited)) {
                if (dfs(maze, newX, newY, visited, dx, dy, found, endX, endY)) {
                    return true;
                }
            }
        }
        visited[x][y] = false;
        return false;
    }
    private static boolean isValid(int[][] maze, int x, int y, boolean[][] visited) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == 1 &&!visited[x][y]);
    }
}
