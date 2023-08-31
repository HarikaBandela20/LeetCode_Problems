class Solution {
    public int bestClosingTime(String customers) {
        int total_sum=0;
        int[] x=new int[customers.length()];
        int t=0;
        for(char c:customers.toCharArray()){
            if(c=='Y'){
                total_sum=total_sum+1;
                x[t]=1;
            }else{
                x[t]=0;
            }
            t++;
        }
        int max_penalty=total_sum;
        int hour=0;
        int i=0;
        while(i<customers.length()){
            total_sum=total_sum-x[i];
            if(x[i]==1){
                x[i]=0;
            }else{
                x[i]=1;
            }
            total_sum=total_sum+x[i];
            if(max_penalty>total_sum){
                max_penalty=total_sum;
                hour=i+1;
            }
            i++;
        }
        return hour;
    }
}