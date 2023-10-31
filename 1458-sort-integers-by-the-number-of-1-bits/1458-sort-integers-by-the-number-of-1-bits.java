class Solution {
    HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
    HashMap<Integer,ArrayList<Integer>> h1=new HashMap<Integer,ArrayList<Integer>>();
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int[] ans=new int[arr.length];
        for(int i:arr){
            int t=i;
            int count=0;
            if(i==0){
                h.put(i,0);
            }
            else{
                while(i>0){
                    if(h.containsKey(i)){
                        count=count+h.get(i);
                        break;
                    }
                    count=count+(i%2);
                    i=i/2;
                }
                h.put(t,count);
            }
        }
        for(int i:arr){
            if(h1.containsKey(h.get(i))){
                ArrayList<Integer> temp=new ArrayList<Integer>(h1.get(h.get(i)));
                temp.add(i);
                h1.put(h.get(i),temp);
            }else{
                ArrayList<Integer> temp=new ArrayList<Integer>();
                temp.add(i);
                h1.put(h.get(i),temp);
            }
        }
        int c=0;
        for(int i:h1.keySet()){
            ArrayList<Integer> temp=new ArrayList<Integer>(h1.get(i));
            for(int j:temp){
                ans[c]=j;
                c++;
            }
        }
        return ans;
    }
}