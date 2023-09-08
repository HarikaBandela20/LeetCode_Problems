class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> x=new ArrayList<Integer>();
            if(i==0){
                x.add(1);
                res.add(x);
            }
            if(i==1){
                x.add(1);
                x.add(1);
                res.add(x);
            }
            if(i>1){
                x.add(1);
                ArrayList<Integer> t = new ArrayList<Integer>(res.get(i-1));
                for(int j=0;j<t.size()-1;j++){
                    x.add(t.get(j)+t.get(j+1));
                }
                x.add(1);
                res.add(x);
            }
        }
        return res;
    }
}