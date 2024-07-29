public class largest_rectangle_in_histogram {
    public int largestRectangleArea(int[] heights){
        int n=heights.length;
        if(n==0) return 0;
        Stack<Integer> stack=new Stack<>();
        int maxArea=0;
        for(int i=0;i<=n;i++){
            int h=i==n?0:heights[i];
            while(!stack.isEmpty() && heights[stack.peek()]>=h){
                int top=stack.pop();
                maxArea=Math.max(maxArea,heights[top]*(i==stack.isEmpty()?i:i-stack.peek()-1));
            }
            stack.push(i);
        }
        return maxArea;
    }
}
