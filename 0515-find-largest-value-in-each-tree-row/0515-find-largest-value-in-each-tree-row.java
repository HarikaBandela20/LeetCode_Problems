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
    HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
    public void storenodes(TreeNode root,int count){
        if(root==null){
            return;
        }
        if(!h.containsKey(count)){
            h.put(count,root.val);
        }else{
            if(h.get(count)<root.val){
                h.put(count,root.val);
            }
        }
        storenodes(root.left,count+1);
        storenodes(root.right,count+1);
    }
    public List<Integer> largestValues(TreeNode root) {
        storenodes(root,0);
        ArrayList<Integer> a=new ArrayList<Integer>(h.values());
        //System.out.println(h);
        return a;
    }
}