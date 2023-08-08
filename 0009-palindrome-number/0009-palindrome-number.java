class Solution {
    public boolean isPalindrome(int x) {
        int per=x;
        int num=0;
        while(x>0)
        {
            int r=x%10;
            num=(num*10)+r;
            x=x/10;
        }
        if(per == num){
            //System.out.print("equal");
            return true;
        }
        return false;
    }
}