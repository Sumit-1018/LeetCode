public class ReverseArray {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        printArray(arr);
        reverse(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr){
        int k;
        for(int i=0;i<arr.length/2;i++){
            k=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=k;
        }
    }

}

