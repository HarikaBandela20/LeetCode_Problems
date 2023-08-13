class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] f1=new int[spells.length];
        int i=0;
        Arrays.sort(potions);
        while(i<spells.length){
            int count=0;
            int start=0;
            int end=potions.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                long product = (long)potions[mid]*spells[i];
                if(product>=success){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            f1[i]=potions.length-start;
            i++;
        }
        return f1;
    }
}