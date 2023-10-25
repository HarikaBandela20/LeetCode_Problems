class Solution {
    public int maxProfit(int[] prices) {
        int first=prices[0];
        int max_ele=0;
        for(int i=1;i<prices.length;i++){
            if(first>prices[i]){
                first=prices[i];
            }else if(prices[i]-first>max_ele){
                max_ele=prices[i]-first;
            }
        }
        return max_ele;
    }
}