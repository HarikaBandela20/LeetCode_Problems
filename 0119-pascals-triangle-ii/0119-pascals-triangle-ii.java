class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l=new ArrayList<Integer>();
        l.add(1);
        if(rowIndex==0){
            return l;
        }
        if(rowIndex==1){
            l.add(1);
            return l;
        }
        while(rowIndex>=1){
            List<Integer> l1=new ArrayList<Integer>();
            l1.add(1);
            for(int i=0;i<l.size()-1;i++){
                l1.add(l.get(i)+l.get(i+1));
            }
            l1.add(1);
            l=l1;
            rowIndex--;
        }
        return l;
    }
}