class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int index=nums[i];
            if(nums[i]!=i+1 && nums[i]!=nums[index-1]){
                int temp=nums[i];
                nums[i]=nums[index-1];
                nums[index-1]=temp;
            }
            else{
                i++;
            }
        }
        int x=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=(j+1)){
                x=nums[j];
            }
        }
        return x;
    }
}