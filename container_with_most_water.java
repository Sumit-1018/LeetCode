public class container_with_most_water {
    public int maxArea(int[] height){
        int max_area=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            max_area=Math.max(max_area,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return max_area;
    }
}
