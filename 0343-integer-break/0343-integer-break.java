class Solution {
    public int integerBreak(int n) {
        if(n<4){
            return n-1;
        }
        int ans=1;
        while(n>0){
            if(n>4){
                n=n-3;
                ans=ans*3;
            }else if(n==4){
                ans=ans*4;
                break;
            }else if(n==3){
                ans=ans*3;
                break;
            }else{
                ans=ans*2;
                break;
            }
        }
        return ans;
    }
}