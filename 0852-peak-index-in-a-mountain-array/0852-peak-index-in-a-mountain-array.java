class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // increasing → go right
                low = mid + 1;
            } else {
                // decreasing → peak is here or left
                high = mid;
            }
        }

        return low; // or high (both same)
    }
}