package com.github.lucaseo90;

import java.util.Arrays;
import java.util.Comparator;

public class No0179 {
    private static class LargestNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        }
    }

    public static String largestNumber(int[] nums) {
        StringBuilder largestNumber = new StringBuilder();
        String[] arr = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(arr, new LargestNumberComparator());
        System.out.println();
        if (arr[0].equals("0")) {
            largestNumber.append("0");
        } else {
            for (String number : arr) {
                largestNumber.append(number);
            }
        }

        return largestNumber.toString();
    }
}
