public class linked_list {
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

        static void addFirst(int n){
            Node temp=new Node(n);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        static void addLast(int n){
            Node newNode=new Node(n);
            if(head==null){
                head=tail=newNode;
                
            }
            tail.next=newNode;
            tail=newNode;
            return;
        }
        static void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        static void removeFirst(){
            if(head==null){
                return;
            }
            head=head.next;
            return;
        }
        static void removeLast(){
            if(head==null){
                return;
            }
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;

        }
        static int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;

        }

        static void delete(int n){
            Node temp=head;
            Node prev=null;
            while(temp!=null){
                if(temp.data==n){
                    if(temp==head){
                        head=head.next;
                    }
                    else{
                        prev.next=temp.next;
                    }
                    return;
                }
                prev=temp;
                temp=temp.next;
            }
            System.out.println(n+" not found");
        }
    public static void main(String[] args) {
        addFirst(69);
        addFirst(96);
        addFirst(89);
        removeLast();
        print();
        System.out.println(size());
        
    }
    
}
//search for a key in ll. Return thr position where it is found. If not found, return -1.