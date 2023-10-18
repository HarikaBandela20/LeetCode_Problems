class Solution {
    public int search(int[] nums, int target,boolean findfirstindex)
    {
        int first=0;
        int last=nums.length-1;
        int ans=-1;
         while(first<=last){
            int mid=first+(last-first)/2;
            if(nums[mid]>target){
                last=mid-1;
            }
            else if(nums[mid]<target){
                first=mid+1;
            }
            else{
                ans=mid;
                if(findfirstindex){
                    last=mid-1;
                }
                else{
                    first=mid+1;
                }
            }
    }
    return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] a={-1,-1};
        boolean findfirstindex;
        int start=search(nums,target,findfirstindex=true);
        int last=search(nums,target,findfirstindex=false);
        a[0]=start;
        a[1]=last;
        return a;
    }
}
