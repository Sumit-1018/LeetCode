public class merge_sort {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        mergeSort(nums, 0, nums.length-1);
    }
    static void mergeSort(int nums[]){
        if(nums.length<=1)
            return;
        int mid=nums.length/2;
        int left[]=new int[mid];
        int right[]=new int[nums.length-mid];
        for(int i=0; i<mid; i++)
            left[i]=nums[i];
        for(int i=mid; i<nums.length; i++)
            right[i-mid]=nums[i];
        mergeSort(left);
        mergeSort(right);
        merge(nums, left, right);
    }
}
