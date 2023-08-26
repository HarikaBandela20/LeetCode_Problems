class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int res=0;
        int count=1;
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>pairs[res][1]){
                res=i;
                count++;
            }
        }
        return count;
    }
}