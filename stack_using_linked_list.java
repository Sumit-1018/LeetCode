public class stack_using_linked_list {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    static Node tail=null;
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        peek();
        pop();
        peek();
        pop();
        peek();
        print();
    }
    
    static void push(int x){
        Node temp=new Node(x);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    static void pop(){
        if(head==null){
            System.out.println("stack is empty");
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    static void peek(){
        System.out.println(tail.data);
    }
    static void isEmpty(){
        if(head==null){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
}
