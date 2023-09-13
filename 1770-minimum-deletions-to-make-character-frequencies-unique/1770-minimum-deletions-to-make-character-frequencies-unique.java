class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> m=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }else{
                m.put(c,1);
            }
        }
        List<Integer> l=new ArrayList<Integer>();
        int sum=0;
        for(int i:m.values()){
            l.add(i);
            sum=sum+i;
        }
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
        int count=l.get(0);
        int lastele=l.get(0);
        for(int i=1;i<l.size();i++){
            int ele=l.get(i);
            if(ele>=lastele){
                count=count+lastele-1;
                l.set(i,lastele-1);
            }else{
                count=count+l.get(i);
            }
            lastele=l.get(i);
            if(lastele==0){
                break;
            }
        }
        System.out.println(l);
        return sum-count;
    }
}