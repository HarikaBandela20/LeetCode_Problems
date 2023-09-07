class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> m=new HashMap<Character,Integer>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int res=0;
        int lastnumber=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(m.get(c)>=lastnumber){
                res=res+m.get(c);
                lastnumber=m.get(c);
            }else{
                res=res-m.get(c);
                lastnumber=m.get(c);
            }
        }
        return res;
    }
}

