public class tower_of_hanoi {
    static void tower_of_hanoi(int n, int from, int aux, int to){
        if(n==1){
            System.out.println(from+" "+to);
            return;
        }
        tower_of_hanoi(n-1,from, to, aux);
        System.out.println(from+" "+to);
        tower_of_hanoi(n-1,aux,from,to);
    }

    public static void main(String[] args) {
        int n=3;
        int from=1;
        int aux=2;
        int to=3;
        tower_of_hanoi(n, from, aux, to);
    }
}
