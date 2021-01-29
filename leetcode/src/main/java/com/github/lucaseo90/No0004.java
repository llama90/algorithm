package com.github.lucaseo90;

public class No0004 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;

        double median = 0;

        final int nums1Length = nums1.length;
        final int nums2Length = nums2.length;
        final int numberOfMedian = (nums1Length + nums2Length) % 2 == 0 ? 2 : 1;
        int[] combinedNums = new int[nums1Length + nums2Length];
        while (i < nums1Length || j < nums2Length) {
            if (i < nums1Length && j < nums2Length) {
                if (nums1[i] >= nums2[j]) {
                    combinedNums[k] = nums2[j];
                    j++;
                } else {
                    combinedNums[k] = nums1[i];
                    i++;
                }
            } else if (i >= nums1Length && j < nums2Length) {
                combinedNums[k] = nums2[j];
                j++;
            } else if (i < nums1Length && j >= nums2Length) {
                combinedNums[k] = nums1[i];
                i++;
            }

            k++;

            if (numberOfMedian == 1 && k - 1 == (nums1Length + nums2Length) / 2) {
                median = combinedNums[k - 1];
                break;
            } else if (numberOfMedian == 2 && k - 1 == (nums1Length + nums2Length) / 2) {
                median = (combinedNums[k - 2] + combinedNums[k - 1]) / 2.0;
                break;
            }
        }

        return Double.parseDouble(String.format("%.5f", median));
    }

}
