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
    int max = 0;
    public void tryleft(TreeNode root, int count1) {
        if (root == null) {
            return;
        }
        count1++;
        if (max < count1) {
            max = count1;
        }
        tryleft(root.left, 1);
        tryright(root.right, count1); 
    }
    public void tryright(TreeNode root, int count2) {
        if (root == null) {
            return;
        }
        count2++;
        if (max < count2) {
            max = count2;
        }
        tryright(root.right, 1);
        tryleft(root.left, count2);
    }
    public int longestZigZag(TreeNode root) {
        tryleft(root, 0); 
        tryright(root, 0);
        return max-1;
    }
}
