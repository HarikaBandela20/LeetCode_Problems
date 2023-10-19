class Solution {
    public String check(String s1){
        String x="";
        Stack<Character> st=new Stack<Character>();
        for(char c:s1.toCharArray()){
            if(c=='#'){
                if(st.isEmpty()){
                    continue;
                }else{
                    st.pop();
                }
            }else{
                st.add(c);
            }
        }
        while(!st.isEmpty()){
            x=x+st.pop();
        }
        return x;
    }
    public boolean backspaceCompare(String s, String t) {
        String a=check(s);
        String b=check(t);
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}