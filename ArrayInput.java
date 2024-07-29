import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {
        System.out.println("Enter the values in the array: ");

        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("The values in the array are: ");
        printArray(arr);
        }
    
    

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
