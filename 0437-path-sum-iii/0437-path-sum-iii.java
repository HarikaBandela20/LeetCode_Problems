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
    int count=0;
    public void pathSum1(TreeNode root1,List<Long> l,int targetSum) {
        List<Long> l1=new ArrayList<Long>();
        l1.add((long)root1.val);
        for(int i=0;i<l.size();i++){
            l1.add((long)root1.val+(long)l.get(i));
        }
        for(int i=0;i<l1.size();i++){
            if(l1.get(i)==targetSum){
                count++;
            }
        }
        //System.out.println(l1);
        if(root1.left!=null){
            pathSum1(root1.left,l1,targetSum);
        }
        if(root1.right!=null){
            pathSum1(root1.right,l1,targetSum);
        }
    }
    public int pathSum(TreeNode root, int targetSum) {
        List<Long> l=new ArrayList<Long>();
        if(root==null){
            return 0;
        }
        pathSum1(root,l,targetSum);
        return count;
    }
}