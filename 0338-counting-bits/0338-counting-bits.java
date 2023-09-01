class Solution {
    public int[] countBits(int n) {
        int[] a1=new int[n+1];
        a1[0]=0;
        for(int i=1;i<=n;i++)
        {
            int t=i;
            int count1=0;
            while(t>0){
                //System.out.println(t&1);
                if((t&1) == 1){
                    count1++;
                }
                    t=t>>>1;
            }
            a1[i]=count1;
        }
        //System.out.println(Arrays.toString(a1));
        return a1;
    }
}