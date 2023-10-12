class Solution {
    public String reverseWords(String s) {
        StringBuilder s1=new StringBuilder();
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' '){
                s1.reverse();
                s1.append(" ");
                res=res+s1.toString();
                s1.delete(0,s1.capacity());
            }else{
                s1.append(c);
            }
        }
        s1.reverse();
        res=res+s1.toString();
        return res;
    }
}