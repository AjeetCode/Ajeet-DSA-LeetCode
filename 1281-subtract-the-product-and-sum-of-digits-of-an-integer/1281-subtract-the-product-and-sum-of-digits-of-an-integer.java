class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int product=1;
        int sum=0;
        while(temp!=0){
            int ld=temp%10;
            sum+=ld;
            product*=ld;
            temp=temp/10;
        }
        return product-sum;
    }
}