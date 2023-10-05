class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<Integer>();
        int count1=0;
        int count2=0;
        int fn=0;
        int sn=0;
        for(int i:nums){
            if(fn!=0 && i==fn){
                count1++;
            }else if(sn!=0 && i==sn){
                count2++;
            }else if(count1==0){
                count1=1;
                fn=i;
            }else if(count2==0){
                count2=1;
                sn=i;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i:nums){
            if(i==fn){
                count1++;
            }
            else if(i==sn){
                count2++;
            }
        }
        //System.out.println(fn+" & "+sn);
        int cap=(nums.length)/3;
        if(fn==sn){
            if(count1+count2>cap){
                res.add(fn);
                return res;
            }
        }else{
            if(count1>cap){
                res.add(fn);
            }
            if(count2>cap){
                res.add(sn);
            }
        }
        return res;
    }
}