class Solution {
    public double myPow(double x, int n) {
        if (n == 0 || x==1) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
            long ln = -(long) n;
            return myPow1(x, ln);
        }
        return myPow1(x, n);
    }
    private double myPow1(double x, long n) {
        if (n == 0) {
            return 1;
        }
        double t = myPow1(x, n / 2);
        t = t * t;
        if (n % 2 != 0) {
            t = t * x;
        }
        return t;
    }
}


