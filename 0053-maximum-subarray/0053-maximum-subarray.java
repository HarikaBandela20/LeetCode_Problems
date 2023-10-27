class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        if(nums.length==1){
            return nums[0];
        }
        int sum=nums[0];
        int start=1;
        max=Math.max(max,sum);
        while(start<nums.length){
            if(nums[start]<sum+nums[start]){
                sum=sum+nums[start];
            }else{
                sum=nums[start];
            }
            start++;
            max=Math.max(max,sum);
        }
        return max;
    }
}