class Solution {
    public String reverseWords(String s) {
        Stack<Character> st=new Stack<Character>();
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' '){
                while(!st.isEmpty()){
                    res=res+st.pop();
                }
                res=res+" ";
            }else{
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            res=res+st.pop();
        }
        return res;
    }
}