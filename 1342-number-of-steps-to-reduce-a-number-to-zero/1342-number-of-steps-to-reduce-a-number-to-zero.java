class Solution {
    public int subtract(int n){
        return n-1;
    }
    public int divide(int n){
        return n/2;
    }
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0){    
            if(num%2!=0){
                num=subtract(num);
                count++;
            } 
            if(num!=0){
                num=divide(num);
                count++;
            }
        }
        return count;
    }
}