public class permutations {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length==0) return result;
        boolean[] visited=new boolean[nums.length];
        Arrays.fill(visited, false);
        List<Integer> path=new ArrayList<>();
        helper(nums, visited, path, result);
        return result;
    }
    private void helper(int[] nums, boolean[] visited, List<Integer> path, List<List<Integer>> result){
        if(path.size()==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(visited[i]) continue;
            visited[i]=true;
            path.add(nums[i]);
            helper(nums, visited, path, result);
            visited[i]=false;
            path.remove(path.size()-1);
        }
    }