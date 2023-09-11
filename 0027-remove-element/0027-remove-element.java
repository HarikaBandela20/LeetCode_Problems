class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        Arrays.sort(nums);
        for(int i:nums){
            if(i==val){
                k++;
            }
        }
        int last=nums.length-1;
        for(int i=0;i<nums.length-k;i++){
           if(nums[i]==val){
               int temp=nums[last];
               nums[last]=nums[i];
               nums[i]=temp;
               last--;
           } 
           System.out.println(Arrays.toString(nums));
        }
        return nums.length-k;
    }
}