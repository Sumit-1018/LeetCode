import java.util.*;
public class buildtreepreorder {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
        Node(int val, Node left, Node right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public static class BinaryTree{
        static int ind=-1;
    public static Node buildTree(int[] nodes){
        ind++;
        if(nodes[ind]==-1){
            
            return null;
        }
        
        Node root=new Node(nodes[ind]);
        root.left=buildTree(nodes);
        root.right=buildTree(nodes);
        return root;
        
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root=buildtreepreorder.BinaryTree.buildTree(nodes);
        System.out.println(root.val);
        preorder(root);
    }
}
}
