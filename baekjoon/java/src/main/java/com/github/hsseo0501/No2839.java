package com.github.hsseo0501;

import java.util.Scanner;

public class No2839 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int remainedLoop = N / 5;
        while(remainedLoop >= 0) {
            int remainedSugar = N - (5 * remainedLoop);
            if(remainedSugar % 3 == 0) {
                int remainedSugarByThree = remainedSugar / 3;
                System.out.println(remainedLoop + remainedSugarByThree);
                return;
            }
            remainedLoop--;
        }
        System.out.println("-1");
    }
}
