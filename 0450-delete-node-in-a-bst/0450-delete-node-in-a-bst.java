/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<TreeNode> x = new ArrayList<>();
    int count=0;
    public void addnodes(TreeNode root, int key) {
        if (root == null) {
            return;
        }
        addnodes(root.left, key);
        if (root.val != key) {
            x.add(root);
            System.out.println(root.val);
        }
        addnodes(root.right, key);
    }
    public TreeNode convertToBST(List<TreeNode> nodes) {
        if (nodes.isEmpty()) {
            return null;
        }
        int mid = nodes.size() / 2;
        TreeNode root = nodes.get(mid);
        root.left = convertToBST(nodes.subList(0, mid));
        root.right = convertToBST(nodes.subList(mid + 1, nodes.size()));
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        addnodes(root, key);
        return convertToBST(x);
    }
}