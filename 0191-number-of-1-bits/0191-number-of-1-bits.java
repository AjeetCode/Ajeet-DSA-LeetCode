class Solution {
    public int hammingWeight(int n) {
       int k=n;
       int count=0;
       while(k>0){
       if((k&1)==1){
       count++;
       }
       k=k>>1; 
    }
    return count;
    }
}
