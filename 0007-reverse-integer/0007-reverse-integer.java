class Solution {
    public int reverse(int x) {
        int temp=x;
        int rev=0;
        while(temp!=0){
            int last=temp%10;
            temp=temp/10;
            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && last > 7){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE && last<-8){
                return 0;
            }
            rev=rev*10+last;
        }
        return rev;
    }
}