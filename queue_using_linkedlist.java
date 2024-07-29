public class queue_using_linkedlist {
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
    static void push(int n){
        Node newNode=new Node(n);
        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    static void pop(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    static void peek(){
        if(head==null){  
            return;
        }
        System.out.println(head.data);
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
