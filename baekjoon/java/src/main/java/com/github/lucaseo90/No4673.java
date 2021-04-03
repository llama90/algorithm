package com.github.lucaseo90;

public class No4673 {

    static int range = 10000;
    static boolean[] selfNumberIndex = new boolean[range + 1];

    public static void main(String[] args) {
        findSelfNumber();
        printSelfNumber();
    }

    public static void findSelfNumber() {
        for (int i = 1; i <= range; i++) {
            int selfNumber = i;

            String digit = String.valueOf(selfNumber);
            for (int j = 0; j < digit.length(); j++) {
                selfNumber += digit.charAt(j) - 48;
            }
            if (selfNumber <= range) {
                selfNumberIndex[selfNumber] = true;
            }
        }
    }

    public static void printSelfNumber() {
        for (int i = 1; i <= range; i++) {
            if (!selfNumberIndex[i]) {
                System.out.println(i);
            }
        }
    }


}
