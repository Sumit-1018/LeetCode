import java.util.*;
public class stack {
    public static void main(String[] args) {
        
        Stack<Integer> s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        System.out.println(s.peek());
        push_at_bottom_using_recursion(s, 4);
        System.out.println(s);
        }
        //push at bottom of stack
        
        static void push_at_bottom_using_recursion(Stack<Integer> s, int n){
            if(s.isEmpty()){
                s.push(n);
                return;
            }
            int temp=s.pop();
            push_at_bottom_using_recursion(s, n);
            s.push(temp);
        }
    }

