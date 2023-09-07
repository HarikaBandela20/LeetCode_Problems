class Solution {
    public int[] plusOne(int[] digits) {
        int rem = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + rem;
            if (digits[i] == 10) {
                rem = 1; 
                digits[i] = 0;
            } else {
                rem = 0; 
            }
        }
       
        if (rem == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1; 
            return res;
        } else {
            return digits;
        }
    }
}
