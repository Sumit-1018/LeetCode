public class selection_sort {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<nums.length;i++){
            int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
