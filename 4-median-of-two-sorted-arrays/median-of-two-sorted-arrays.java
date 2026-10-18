class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int left = 0;
        int right = m;

        while (left <= right) {

            int cut1 = (left + right) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int left1;
            int left2;
            int right1;
            int right2;

            if (cut1 == 0) {
                left1 = Integer.MIN_VALUE;
            } else {
                left1 = nums1[cut1 - 1];
            }

            if (cut2 == 0) {
                left2 = Integer.MIN_VALUE;
            } else {
                left2 = nums2[cut2 - 1];
            }

            if (cut1 == m) {
                right1 = Integer.MAX_VALUE;
            } else {
                right1 = nums1[cut1];
            }

            if (cut2 == n) {
                right2 = Integer.MAX_VALUE;
            } else {
                right2 = nums2[cut2];
            }

            if (left1 <= right2 && left2 <= right1) {

                if ((m + n) % 2 == 0) {
                    int maxLeft = Math.max(left1, left2);
                    int minRight = Math.min(right1, right2);

                    return (maxLeft + minRight) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            }

            if (left1 > right2) {
                right = cut1 - 1;
            } else {
                left = cut1 + 1;
            }
        }

        return 0.0;
    }
}