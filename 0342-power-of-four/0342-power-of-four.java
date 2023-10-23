class Solution {
    public boolean isPowerOfFour(int n) {
        int r=0;
        while(n>4){
            r=n%4;
            if(r!=0){
                return false;
            }
            n=n/4;
        }
        if(r==0 && (n==4 || n==1)){
            return true;
        }
        return false;
    }
}