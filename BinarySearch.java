public class BinarySearch {
    public static void main(String[] args){
        int arr[]={10,12,14,16,18,20,22,24};
        int start = 0;
        int end = arr.length-1;
        int mid=0;
        int key = 24;
        while(start<=end){
            mid = start+((end-start)/2);
            if(arr[mid]==key){
                System.out.println("Element found at index "+mid);
                break;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
    
    }
}
}
