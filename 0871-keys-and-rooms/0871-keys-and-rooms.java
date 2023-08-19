class Solution {
    HashMap<Integer,String> h=new HashMap<Integer,String>();
    public void scan(List<List<Integer>> rooms1, List<Integer> room){
        if(room.size()==0){
            return;
        }
        for(int i:room){
            if(h.get(i)!="true"){
                h.put(i,"true");
                List<Integer> x1=new ArrayList<Integer>(rooms1.get(i));
                scan(rooms1,x1);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        h.put(0,"true");
        for(int i=1;i<rooms.size();i++){
            h.put(i,"false");
        }
        scan(rooms,rooms.get(0));
        //System.out.println(h);
        for(int i:h.keySet()){
            if(h.get(i)=="false"){
                return false;
            }
        }
        return true;
    }
}