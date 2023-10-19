class Solution {
    public void check(String s1,Stack<Character> st){
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
    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> a=new Stack<Character>();
        Stack<Character> b=new Stack<Character>();
        check(s,a);
        check(t,b);
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}