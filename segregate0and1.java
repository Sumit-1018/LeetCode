public class segregate0and1 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8};
        segregate(arr); 
    }
    void segregate(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(arr[i]==0 && i<j){
                i++;
            }
            while(arr[j]==1 && i<j){
                j--;
            }
            if(i<j){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
