class Solution {
    List<String> l=new ArrayList<String>();
    List<String> f=new ArrayList<String>();
    public void addcombinations(char c,List<String> l,String x,int round){
        if(l.size()==0){
            for(int j=0;j<x.length();j++){
                l.add(String.valueOf(x.charAt(j)));
            }
        }else{
            List<String> l1=new ArrayList<String>(l);
            for(int j=0;j<l1.size();j++){
                for(int k=0;k<x.length();k++){
                    l.add(l1.get(j)+String.valueOf(x.charAt(k)));
                }
            }
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return l;
        }
        Map<Character,String> m=new HashMap<Character,String>();
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
        m.put('5',"jkl");
        m.put('6',"mno");
        m.put('7',"pqrs");
        m.put('8',"tuv");
        m.put('9',"wxyz");
        for(int i=0;i<digits.length();i++){
            char c=digits.charAt(i);
            addcombinations(c,l,m.get(c),i);
            //System.out.println(l);
        }
        List<String> f=new ArrayList<String>();
        for(int i=0;i<l.size();i++){
            if(l.get(i).length()==digits.length()){
                f.add(l.get(i));
            }
        }
        return f;
    }
}