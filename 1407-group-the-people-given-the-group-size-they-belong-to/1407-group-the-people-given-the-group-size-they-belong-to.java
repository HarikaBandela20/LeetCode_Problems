class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,List<Integer>> h=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            int c=groupSizes[i];
            if(h.containsKey(c)){
                ArrayList<Integer> x=new ArrayList<Integer>(h.get(c));
                x.add(i);
                h.put(c,x);
            }else{
                ArrayList<Integer> x=new ArrayList<Integer>();
                x.add(i);
                h.put(c,x);
            }
        }
        //System.out.println(h);
        for(int i:h.keySet()){
            ArrayList<Integer> t=new ArrayList<Integer>(h.get(i));
            if(i==t.size()){
                res.add(t);
            }else{
                int start=0;
                while(start<(t.size()))
                {
                    ArrayList<Integer> t1=new ArrayList<Integer>();
                    for(int j=start;j<start+i;j++){
                        t1.add(t.get(j));
                    }
                    res.add(t1);
                    start=start+i;
                }
            }
        }
        return res;
    }
}