class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cap=nums.length/3;
        HashMap<Integer,Integer> x=new HashMap<Integer,Integer>();
        List<Integer> res=new ArrayList<Integer>();
        for(int i:nums){
            if(!res.contains(i)){
                x.put(i, x.getOrDefault(i, 0)+1);
            }
            if(x.get(i)>cap && !res.contains(i)){
                res.add(i);
            }
        }
        //System.out.println(x);
        return res;
    }
}