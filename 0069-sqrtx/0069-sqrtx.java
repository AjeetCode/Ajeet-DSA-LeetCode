class Solution {
    public int mySqrt(int x) {
        int k=0;
        for(int i=0;i<=x;i++){
            if((long)i*i<=x){
                k=i;
            }
            else {
                break;
            }
        }
        return k;
    }
}