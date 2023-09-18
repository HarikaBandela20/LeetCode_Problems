class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int a[]=new int[mat.length];
        HashMap<Integer,List<Integer>> h=new HashMap<>();
        ArrayList<Integer> m=new ArrayList<Integer>();
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            a[i]=count;
            if(!m.contains(count)){
                m.add(count);
            }
            if(!h.containsKey(a[i])){
                ArrayList<Integer> t=new ArrayList<Integer>();
                t.add(i);
                h.put(a[i],t);
            }else{
                ArrayList<Integer> t=new ArrayList<Integer>(h.get(a[i]));
                t.add(i);
                h.put(a[i],t);
            }
        }
        int res[]=new int[k];
        int index=0;
        Collections.sort(m);
        for(int j:m){
            ArrayList<Integer> t=new ArrayList<Integer>(h.get(j));
            if(index==k){
                break;
                }
            if(t.size()==1){
                res[index]=t.get(0);
                index++;
            }else{
                if(index==k){
                    break;
                }
                for(int i:t){
                    res[index]=i;
                    index++;
                    if(index==k){
                        break;
                    }
                }
            }
        }
        return res;
    }
}