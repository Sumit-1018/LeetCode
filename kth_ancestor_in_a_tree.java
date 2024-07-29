public class kth_ancestor_in_a_tree {
    public int kthAncestor(Node root, int k, int node)
    {
        if(root==null){
            return -1;
        }
        if(root.data==node){
            return 0;
        }   
        int left=kthAncestor(root.left,k,node);
        int right=kthAncestor(root.right,k,node);
        if(left==-1 && right==-1){
            return -1;
        }
        int max=Math.max(left,right);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
    
}
