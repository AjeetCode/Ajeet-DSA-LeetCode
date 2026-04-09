/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i=1;
        int j=n;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(isBadVersion(mid)){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
}




// bro, this soln of bruteforce, which gives tle, you have to apply binary search!
// public class Solution extends VersionControl {
//     public int firstBadVersion(int n){
//         for(int i=1;i<=n;i++){
//             boolean ptaKro=isBadVersion(i);
//             if(ptaKro==true){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }