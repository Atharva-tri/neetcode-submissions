 

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        System.arraycopy(nums1, 0, arr, 0, m);
        System.arraycopy(nums2, 0, arr, m, n);

        Arrays.sort(arr);

        int len = arr.length;
        double median = 0;

        if (len % 2 == 0) {
            median = (arr[len / 2] + arr[len / 2 - 1]) / 2.0;
        } else {
            median = arr[len / 2];
        }

        return median;
    }
}