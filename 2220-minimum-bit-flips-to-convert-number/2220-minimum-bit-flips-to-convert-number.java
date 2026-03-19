class Solution {
    public int minBitFlips(int start, int goal) {
        int n1=start;
        int n2=goal;
        int count=0;
        while(((n1>0) || (n2>0))){
            if(!((n1&1)==(n2&1))){
                count++;
            }
            n1=n1>>1;
            n2=n2>>1;
        }
        return count;
    }
}