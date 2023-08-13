class Solution {
    public int longestSubarray(int[] nums) {
       List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                l.add(i);
            }
        }
        if(l.size() <= 1){
            return nums.length-1;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l.size();i++)
        {
            if(i==0){
                if(max < (l.get(i+1)-1) ){
                    max=l.get(i+1)-1;
                }
            }
            else if(i == l.size()-1){
                if(max < ((nums.length)-(l.get(i-1)+1)-1)){
                    max = ((nums.length)-(l.get(i-1)+1)-1);
                }
            }
            else{
                if(max < ((l.get(i+1)-1)-(l.get(i-1))-1)){
                    max=((l.get(i+1)-1)-(l.get(i-1))-1);
                }
            }
        }
        return max;
    }
}