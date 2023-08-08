class Solution {
    public int findNumberOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        int[] lis=new int[nums.length];
        int[] count=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            lis[i]=1;
            count[i]=1;
        }
        int max=0;
        for(int i=nums.length-2;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
                //System.out.println("value of i = "+i+" value of j= "+j);
                if(nums[i]<nums[j]){
                    if(lis[j]+1>lis[i]){
                        lis[i]=lis[j]+1;
                        count[i]=count[j];
                    }else if(lis[i] == 1+lis[j]){
                        count[i]=count[i]+count[j];
                    }
                }
            }
            max=Math.max(max,lis[i]);
        }
        int f=0;
        for(int i=0;i<nums.length;i++){
            if(lis[i]==max){
                f=f+count[i];
            }
        }
        return f;
    }
}