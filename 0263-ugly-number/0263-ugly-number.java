class Solution {
    public boolean isUgly(int n) {
        // ugly number...
        int temp=n;
        if(temp==0) return false;
        while(temp%2==0 || temp%3==0 || temp%5==0){
            if(temp%2==0){
                temp=temp/2;
            }else if(temp%3==0){
                temp=temp/3;
            }else if(temp%5==0){
                temp=temp/5;
            }
        }
        if(temp==1) return true;
        else return false;
    }
}