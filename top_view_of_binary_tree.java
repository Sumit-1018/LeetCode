import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class top_view_of_binary_tree {
    class Solution {
        // Function to return a list of nodes visible from the top view
        // from left to right in Binary Tree.
        static ArrayList<Integer> topView(Node root) {
            ArrayList<Integer> arr = new ArrayList<>();
            if(root==null){
                return arr;
            }
            Queue<Info> q = new LinkedList<>();
            Map<Integer,Node> map=new HashMap<>();
            int min=0;
            int max=0;
            q.add(new Info(root,0));
            while(!q.isEmpty()){
                Info curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    if(curr.hd-1<min){
                        min=curr.hd-1;
                    }
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    if(curr.hd+1>max){
                        max=curr.hd+1;
                    }
                }
            }
            for(int i=min;i<=max;i++){
                arr.add(map.get(i).data);
            }
            return arr;
           
            
            
        }
    }
    static class Info{
        int h;
        Node n;
        Info(Node n,int h){
            this.n=n;
            this.h=h;
        }
    }
    
}








ArrayList<Integer> ans = new ArrayList<>();
            if (root == null) {
                return ans;
            }
            Map<Integer, Integer> map = new HashMap<>();
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            map.put(root.data, 0);
            while (!queue.isEmpty()) {
                Node temp = queue.poll();
                int hd = map.get(temp.data);
                if (!map.containsKey(hd)) {
                    map.put(hd, temp.data);
                }
                if (temp.left!= null) {
                    queue.add(temp.left);
                    map.put(hd - 1, temp.left.data);
                }
                if (temp.right!= null) {
                    queue.add(temp.right);
                    map.put(hd + 1, temp.right.data);
                }
            }