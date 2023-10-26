class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        long total=0;
        HashMap<Integer,Long> a=new HashMap<Integer,Long>();
        for(int i=0;i<arr.length;i++){
            long start=1;
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0 && a.containsKey(arr[i]/arr[j])){
                   start=start+(a.get(arr[j])*a.get(arr[i]/arr[j]));
                }
            }
            a.put(arr[i],start);
            total=(total+start)%(1000000007);
        }
        return (int)total;
    }
}