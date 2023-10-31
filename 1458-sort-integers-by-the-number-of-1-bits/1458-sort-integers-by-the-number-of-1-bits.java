class Solution {
    HashMap<Integer,ArrayList<Integer>> h=new HashMap<Integer,ArrayList<Integer>>();
    public int[] sortByBits(int[] arr) {
        int[] ans=new int[arr.length];
        for(int i:arr){
            int t=i;
            if(i==0){
                ArrayList<Integer> a=new ArrayList<Integer>();
                a.add(i);
                h.put(0,a);
            }
            else{
                int count=0;
                while(i>0){
                    count=count+(i%2);
                    i=i/2;
                }
                if(h.containsKey(count)){
                    ArrayList<Integer> a=new ArrayList<Integer>(h.get(count));
                    a.add(t);
                    h.put(count,a);
                }else{
                    ArrayList<Integer> a=new ArrayList<Integer>();
                    a.add(t);
                    h.put(count,a);
                }
            }
        }
        int c=0;
        //System.out.println(h);
        for(int i:h.keySet()){
            ArrayList<Integer> temp=new ArrayList<Integer>(h.get(i));
            Collections.sort(temp);
            for(int j:temp){
                ans[c]=j;
                c++;
            }
        }
        return ans;
    }
}