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
        System.out.println(h);
        int res[]=new int[k];
        int index=0;
        Collections.sort(m);
        for(int j:m){
            for(int i=0;i<a.length;i++){
                if(index==k){
                    break;
                }
                if(a[i]==j){
                    res[index]=i;
                    index++;
                }
            }
        }
        return res;
    }
}