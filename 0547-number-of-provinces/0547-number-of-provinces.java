class Solution {
    ArrayList<ArrayList<Integer>> l=new ArrayList<ArrayList<Integer>>();
    int count=0;
    ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
    public ArrayList<Integer> scan(ArrayList<Integer> a1, ArrayList<ArrayList<Integer>> l1,int index){
        ArrayList<Integer> temp1=l1.get(index);
        for(int j:temp1){
            if(!a1.contains(j)){
                a1.add(j);
                scan(a1,l1,j);
            }
        }
        return a1;
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp=new ArrayList<Integer>(); 
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    temp.add(j);
                }
            }
            l.add(temp);
        }
        for(int i=0;i<n;i++){
            ArrayList<Integer> sequence=new ArrayList<Integer>(); 
            sequence.add(i);
            ArrayList<Integer> r1=new ArrayList<Integer>(scan(sequence,l,i));
            Collections.sort(r1);
            if(!result.contains(r1)){
                result.add(r1);
            }
        }
        return result.size();
    }
}