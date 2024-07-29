
public class shortest_path {
    public static void main(String[] args) {
        String path="WNEENESENNN";
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else if(path.charAt(i)=='W'){
                x--;
            }
        }
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
        x=x*x;
        y=y*y;
        int z=x+y;
        double shortest_path = Math.sqrt(z);
        System.out.println("Shortest path: " + shortest_path); 



    }
}
