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
    HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
    public void levelsum(TreeNode root,int level){
        if(root==null){
            return ;
        }
        if(!m.containsKey(level)){
            m.put(level,root.val);
        }else{
            m.put(level,m.get(level)+root.val);
        }
        levelsum(root.left,level+1);
        levelsum(root.right,level+1);
    }
    public int maxLevelSum(TreeNode root) {
        levelsum(root,1);
        //System.out.println(m);
        int max=Integer.MIN_VALUE;
        int count=1;
        int index=-1;
        for(int i:m.values()){
            if(max<i){
                max=i;
                index=count;
            }
            count++;
        }
        return index;
    }
}