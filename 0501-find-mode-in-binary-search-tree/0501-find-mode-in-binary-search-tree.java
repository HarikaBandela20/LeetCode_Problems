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
    ArrayList<Integer> a=new ArrayList<Integer>();
    int prevval=0;
    int nodecount=0;
    int maxcount=0;
    private void traversetree(TreeNode root){
        if(root==null){
            return;
        }
        traversetree(root.left);
        if(root.val==prevval){
            nodecount++;
        }else{
            nodecount=1;
            prevval=root.val;
        }
        if(nodecount>maxcount){
            maxcount=nodecount;
            a.clear();
            a.add(root.val);
        }else if(nodecount==maxcount){
            a.add(root.val);
        }
        traversetree(root.right);
    }
    public int[] findMode(TreeNode root) {
        traversetree(root);
        int[] ans=new int[a.size()];
        int c=0;
        for(int i:a){
            ans[c]=i;
            c++;
        }
        return ans;
    }
}