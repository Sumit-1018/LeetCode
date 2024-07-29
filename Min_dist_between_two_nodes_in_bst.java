public class Min_dist_between_two_nodes_in_bst {
    A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} 

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    int findDist(Node root, int a, int b) {
        if (root == null){
            return -1;
        }
        if (root.data == a || root.data == b){
            return 0;
        }
        int l = findDist(root.left, a, b);
        int r = findDist(root.right, a, b);
        if (l == -1 && r == -1){
            return -1;
        }
        if (l == -1){
            return r + 1;
        }
        if (r == -1){
            return l + 1;
        }
        return Math.min(l, r) + 1;
        // Your code here
    }
}
}
