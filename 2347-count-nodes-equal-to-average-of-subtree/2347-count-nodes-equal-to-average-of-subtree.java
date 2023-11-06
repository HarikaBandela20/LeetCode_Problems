class Solution {
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        int[] result = dfs(root);
        return ans;
    }
    public int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0}; // {sum, count}
        }
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        int sum = left[0] + right[0] + node.val;
        int count = left[1] + right[1] + 1;
        if(Math.floor(sum/count)==node.val || Math.ceil(sum/count)==node.val){
            ans++;
        }
        if (sum % count == 0) {
            return new int[]{sum, count};
        } else {
            return new int[]{sum, count};
        }
    }
}
