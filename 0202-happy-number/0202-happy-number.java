class Solution {
    public int sqSum(int n){
        int temp=n;
        int sqS=0;
        while(temp>0){
            int ld=temp%10;
            sqS+=ld*ld;
            temp=temp/10;
        }
        return sqS;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=sqSum(n);
        }
        return n==1;
    }
}