class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        boolean nOp=false;
        if(num<0) nOp=true;
        num=Math.abs(num);
    String ans="";
    while(num!=0){
        int lastBit=num%7;
        ans=lastBit+ans;
        num=num/7;
    }
    return nOp==true?("-" + ans):ans;
    }
}