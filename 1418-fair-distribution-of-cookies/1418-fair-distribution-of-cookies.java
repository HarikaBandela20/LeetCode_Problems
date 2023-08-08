class Solution {
    int ans = Integer.MAX_VALUE;

    public void addcookies(int[] cookies, int start, int k, int[] temp) {
        if (start == cookies.length) {
            int max = 0;
            for (int c : temp)
                max = Math.max(max, c);
            ans = Math.min(ans, max);
            return;
        }
        for (int i = 0; i < k; i++) {
            temp[i] += cookies[start];
            addcookies(cookies, start + 1, k, temp);
            temp[i] -= cookies[start];
        }
    }

    public int distributeCookies(int[] cookies, int k) {
        addcookies(cookies, 0, k, new int[k]);
        return ans;
    }
}