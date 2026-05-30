class Solution {
    public boolean isPerfectSquare(int num) {
        if(num ==1) return true;
        for(int i=1;i<num;i++){
            long product=i*i;
            if(product == num) return true;
            else if(product>num) return false;
        }
        return false;
    }
}