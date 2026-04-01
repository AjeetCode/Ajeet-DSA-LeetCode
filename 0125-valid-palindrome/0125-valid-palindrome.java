class Solution {
    public boolean isPalindrome(String s) {
    
        StringBuilder sb=new StringBuilder();
        int l=s.length();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder revSb=new StringBuilder(sb);
        sb.reverse();
        // if(revSb==sb) return true;  == compares addres of both string.
        // else return false;  use s1.equals(s1); but, this is not String builder function. is is Sting function.
        return (revSb.toString()).equals(sb.toString());


    }
}