class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i:nums){
            h.add(i);
        }
        if(nums.length!=h.size()){
            return true;
        }
        return false;
    }
}