public class stack_using_array {
    static int s=0;
    public static void main(String[] args) {
        
    int[] arr=new int[9];
    push(arr,1);
    push(arr,2);
    push(arr,3);
    System.out.println(peek(arr));
    System.out.println(pop(arr));
    System.out.println(peek(arr));
    System.out.println(isEmpty(arr));
    }
    public static void push(int[] array,int value){
        array[s++]=value;
    }
    public static int pop(int[] array){
        return array[--s];
    }
    public static int peek(int[] array){
        return array[s-1];
    }
    public static boolean isEmpty(int[] array){
        return (s==0);
    }
}
