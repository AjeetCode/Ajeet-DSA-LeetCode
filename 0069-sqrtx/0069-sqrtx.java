class Solution {
    public int mySqrt(int x) {
        for(int i = 1; (i-1)*(i-1) <= x; i++) {
            if((long)i*i == (long)x) {
                return i;
            } else if((long)i*i > (long)x) {
                return i-1;
            }
        }
        return 0;
    }
}