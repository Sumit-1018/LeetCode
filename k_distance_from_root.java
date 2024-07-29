import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class k_distance_from_root {

class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} 

class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          ArrayList<Integer> arr=new ArrayList<>();
          if(root==null){
            return arr;
          }
          Queue<Node> q=new LinkedList<>();
          q.add(root);
          while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
              Node temp=q.remove();
              if(i==k){
                arr.add(temp.data);
              }
              if(temp.left!=null){
                q.add(temp.left);
              }
              if(temp.right!=null){
                q.add(temp.right);
              }
            }
          }
          return arr;
     }
}

    
}
