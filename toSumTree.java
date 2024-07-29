public class toSumTree {
    public void toSumTree(Node root){
        //add code here.
        if(root==null){
            return 0;
        }
        toSumTree(root.left);
        toSumTree(root.right);
        int temp=root.data;
        root.data=root.left.data+root.right.data;
        root.left.data=temp;
        root.right.data=temp;
 
       
   }
}
