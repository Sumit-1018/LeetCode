
public class LinearSearch {
    public static void main(String[] args) {
        //Linear Search
        int arr[]={1,2,3,14,5,6,7,8,9,11,10};
        // int key = 5;
        // //Searching for key in array
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] == key){
        //         j=i;
        //         break;
        //     }
            
        // }
        // if(j==0){
        //     System.out.println(key + " not found in the array");
        // }else{
        //     System.out.println(key + " found in the array at index " + j);
        // }
        int j=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>j){
                j=arr[i];
            }
        }
        System.out.println("Largest element found is: " + j);
        
    }
}
