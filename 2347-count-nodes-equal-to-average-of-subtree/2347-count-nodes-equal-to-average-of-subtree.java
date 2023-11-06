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
    Stack<Integer> s=new Stack<Integer>();
    Stack<Integer> n=new Stack<Integer>();
    Stack<Integer> e=new Stack<Integer>();
    public int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        int t=sum(root.left)+sum(root.right);
        s.push(root.val+t);
        n.add(root.val);
        return root.val+t;
    }
    public int count(TreeNode root){
        if(root==null){
            return 0;
        }
        int t=count(root.left)+count(root.right)+1;
        e.push(t);
        return t;
    }
    public int averageOfSubtree(TreeNode root) {
        sum(root);
        count(root);
        int ans=0;
        while(!s.isEmpty()){
            int i=s.pop();
            int j=e.pop();
            int k=n.pop();
            if(Math.floor(i/j)==k || Math.ceil(i/j)==k){
                ans++;
            }
        }
        System.out.println(s);
        System.out.println(n);
        System.out.println(e);
        return ans;
    }
}