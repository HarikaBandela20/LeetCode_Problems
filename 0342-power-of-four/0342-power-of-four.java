class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
        double x=Math.log(n)/Math.log(4);
        if(x==(int)x){
            return true;
        }
        return false;
    }
}