package com.github.lucaseo90.algo.day04.twopointer;

public class No0344 {
    public char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right) {
            this.swap(s, left, right);
            left += 1;
            right -= 1;
        }
        return s;
    }
    
    private void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
