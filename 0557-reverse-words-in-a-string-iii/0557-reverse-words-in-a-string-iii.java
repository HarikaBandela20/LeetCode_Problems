class Solution {
    public String reverseWords(String s) {
        String[] x=s.split(" ");
        String res="";
        for(int i=0;i<x.length;i++){
            String temp=x[i];
            for(int j=temp.length()-1;j>=0;j--){
                res=res+temp.charAt(j);
            }
            if(i<x.length-1){
                res=res+" ";
            }
        }
        return res;
    }
}