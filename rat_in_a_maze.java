public class rat_in_a_maze {
    public static ArrayList<String> findPath(int[][] m,int n){
        ArrayList<String> path = new ArrayList<>();
        boolean[][] visited = new boolean[m.length][n.length];
        findPathUtil(m, 0, 0, n, visited, path, "");
        return path;
    }
    
    private static boolean findPathUtil(int[][] m, int x, int y, int n, boolean[][] visited, ArrayList<String> path, String currPath){
        if(x<0 || x>=m.length || y<0 || y>=n || m[x][y]==0 || visited[x][y])
            return false;
        
        visited[x][y] = true;
        currPath += "(" + x + "," + y + ")";
        
        if(x==m.length-1 && y==n-1){
            path.add(currPath);
            visited[x][y] = false;
            return true;
        }
        
        boolean isPathFound = findPathUtil(m, x-1, y, n, visited, path, currPath) || findPathUtil(m, x+1, y, n, visited, path, currPath) ||
                          findPathUtil(m, x, y-1, n, visited, path, currPath) || findPathUtil(m, x, y+1, n, visited, path, currPath);
        
        if(!isPathFound
    }
}
