class Solution {
    public int search(int[] nums, int target) {
        int index = findIndex(nums);

        int k = -1;

        if (index > 0) {
            k = binaryIndex(nums, target, 0, index - 1);
        }

        if (k != -1) return k;

        return binaryIndex(nums, target, index, nums.length - 1);
    }

    public int findIndex(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            int next = (mid + 1) % n;
            int prev = (mid - 1 + n) % n;

            if (arr[mid] < arr[next] && arr[mid] < arr[prev]) {
                return mid;
            }
            else if (arr[mid] <= arr[e]) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        return 0;  // ✅ important fix
    }

    public int binaryIndex(int[] nums, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }
}


// class Solution {
//     public int search(int[] nums, int target) {
//         // index(FIND INDEX OF MINIMUM ELEMENT!);
//         int index=findIndex(nums);
//         // bS(from 0 to index-1);
//         int k=-1;
//         if(index>0){
//             k=binaryIndex(nums,target,0,index-1);
//         }
//         if(k!=-1) return k;
//         // bS(from index to length-1);
//         k=binaryIndex(nums,target,index,nums.length-1);
//         return k;
//     }
//     public int findIndex(int[] arr){
//         int l=arr.length;
//         int s=0;
//         int e=l-1;
//         while(s<=e){
//             int mid=s+(e-s)/2;
//             int next=(mid+1)%l;
//             int prev=(mid-1+l)%l;
//             if(arr[mid]<arr[next] && arr[mid]<arr[prev]){
//                 return mid;
//             }
//             else if(arr[s]<=arr[mid]){
//                 s=mid+1;
//             }
//             else{
//                 e=mid-1;
//             }
//         }
//         return 0;
//     }
//     public int binaryIndex(int[] nums, int target, int s, int e){
//         while(s<=e){
//             int mid=s+(e-s)/2;
//             if(nums[mid]==target) return mid;
//             else if(nums[mid]<target) s=mid+1;
//             else e=mid-1;
//         }
//         return 0;
//     }
// }












// class Solution {
//     public int search(int[] nums, int target) {
//         int ind=minInd(nums);
//         int x=bs(nums,0,ind-1,target);
//         if(x!=-1) return x;
//         else return(bs(nums,ind,nums.length-1,target));
//     }
//     // find the index of minimum element
//     public int minInd(int[] nums){
//         int start=0;
//         int end=nums.length-1;
//         while(start<end){
//             int mid=start+(end-start)/2;
//             if(nums[mid]>nums[end]) start=mid+1;
//             else end=mid;
//         }
//         return start;
//     }
//     public int bs(int[] nums, int start, int end,int target){
       
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }
//             else if(target<nums[mid]){
//                 end=mid-1;
//             }
//             else{
//                 start=mid+1;
//             }
//         }
//         return -1;
//     }
// }
