
public class unbalanced_to_balancedBST {
    class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inorderTraversal(root, values);
        int n = values.size();
        return buildBST(values, 0, n - 1);

    }
    
    private void inorderTraversal(TreeNode root, List<Integer> values) {
        if (root == null)
            return;
            
        inorderTraversal(root.left, values);
        values.add(root.val);
        inorderTraversal(root.right, values);
    }
    
    private TreeNode buildBST(List<Integer> values, int start, int end) {
        if (start > end)
            return null;
            
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(values.get(mid));
        node.left = buildBST(values, start, mid - 1);
        node.right = buildBST(values, mid + 1, end);
        return node;
    }
}
}
