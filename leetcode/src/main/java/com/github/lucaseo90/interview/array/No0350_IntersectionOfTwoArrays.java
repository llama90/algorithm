package com.github.lucaseo90.interview.array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class No0350_IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersection = new LinkedList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!hashMap.containsKey(nums1[i])) {
                hashMap.put(nums1[i], 1);
            } else {
                hashMap.put(nums1[i], hashMap.get(nums1[i]) + 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.containsKey(nums2[i]) && hashMap.get(nums2[i]) > 0) {
                intersection.add(nums2[i]);
                hashMap.put(nums2[i], hashMap.get(nums2[i]) - 1);
            }
        }

        int[] intersectionArray = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            intersectionArray[i] = intersection.get(i);
        }

        return intersectionArray;
    }
}
