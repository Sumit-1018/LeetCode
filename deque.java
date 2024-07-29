import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> a = new LinkedList<Integer>();
        a.addFirst(1);
        a.addFirst(2);
        a.addLast(3);
        a.addLast(4);
        System.out.println(a);

        a.removeFirst();
        a.removeLast();
        System.out.println(a);
    }
}
