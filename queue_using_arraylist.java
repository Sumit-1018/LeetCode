import java.util.*;
public class queue_using_arraylist {
    static ArrayList<Integer> q=new ArrayList<Integer>();
    public static void main(String[] args){
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        System.out.println(q);
        System.out.println(peek());
        pop();
        System.out.println(q);
        System.out.println(peek());
        System.out.println(isEmpty());

    }
    public static void push(int x){
        q.add(x);
    }
    public static void pop(){
        q.remove(0);
    }
    public static int peek(){
        return q.get(0);
    }
    public static boolean isEmpty(){
        return q.isEmpty();
    }
}
