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
    List<Integer> l1=new ArrayList<Integer>();
    List<Integer> l2=new ArrayList<Integer>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        addleafnodes(root1,l1);
        addleafnodes(root2,l2);
        if(l1.equals(l2)){
            return true;
        }
        return false;
    }
    public void addleafnodes(TreeNode root,List<Integer> l){
        if(root!=null){
            if(root.left == null && root.right == null){
            l.add(root.val);
        }
        addleafnodes(root.left,l);
        addleafnodes(root.right,l);
        }
    }
}