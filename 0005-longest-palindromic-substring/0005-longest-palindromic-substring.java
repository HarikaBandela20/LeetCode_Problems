class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int start=0;
        int end=0;
        int max=0;
        String main_string="";
        for(int i=0;i<s.length();i++)
        {
            System.out.println(i);
            String s1=checkpalindrome(s,i,i);
            String s2=checkpalindrome(s,i,i+1);
            if(max<Math.max(s1.length(),s2.length())){
                if(s1.length()>=s2.length()){
                    max=s1.length();
                    main_string=s1;
                }
                else{
                    max=s2.length();
                    main_string=s2;
                }
            }
        }
        return main_string;
    }
    private String checkpalindrome(String s, int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        System.out.println("string will be "+s.substring(start+1,end));
        return s.substring(start+1,end);
    }
}