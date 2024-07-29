public class queue_using_array {
    static int size = 0;
    static int[] array = new int[9];
    static int front = 0;

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        System.out.println(pop());
        System.out.println(peek());
        System.out.println(isEmpty());

    }
    public static void push(int val){
        array[size++]=val;
    }
    public static int pop(){
        int z=array[front];
        array[front]=array[front+1];
        size--;
        return z;
    }
    public static int peek(){
        return array[front];
    }
    public static boolean isEmpty(){
        return (size==0);
    }
}
