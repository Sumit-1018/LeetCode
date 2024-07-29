import java.util.*;
public class stack_using_arraylist {
    static ArrayList<Integer> s=new ArrayList<Integer>();
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        System.out.println(s);
        System.out.println(peek());
        pop();
        System.out.println(peek());
        System.out.println(isEmpty());
    }
    public static void push(int x){
        s.add(x);
    }
    public static void pop(){
        s.remove(s.size()-1);
    }
    public static int peek(){
        return s.get(s.size()-1);
    }
    public static boolean isEmpty(){
        return s.isEmpty();
    }
}
