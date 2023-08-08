/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, TreeNode> parentMap = new HashMap<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, null);
        Set<TreeNode> ancestorsOfP = new HashSet<>();
        while (p != null) {
            ancestorsOfP.add(p);
            p = parentMap.get(p);
        }
        while (q != null) {
            if (ancestorsOfP.contains(q)) {
                return q;
            }
            q = parentMap.get(q);
        }
        return null;
    }
    private void dfs(TreeNode node, TreeNode parent) {
        if (node == null) {
            return;
        }
        parentMap.put(node, parent);
        dfs(node.left, node);
        dfs(node.right, node);
    }
}