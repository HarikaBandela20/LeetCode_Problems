class Solution {
   public int add(int c) {
    if (c > 0) {
        return c + add(c - 1);
    }
    return 0;
    }
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        HashSet<Integer> num=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        System.out.println(h);
        for(int i:num){
            if(h.get(i)>1){
                count=count+(add(h.get(i)-1));
            }
        }
        return count;
    }
}