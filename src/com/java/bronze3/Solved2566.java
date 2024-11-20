package com.java.bronze3;

import java.util.Scanner;

public class Solved2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[][] arr = new Integer[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int col = 1;
        int row = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    col = i + 1;
                    row = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.print(col + " " + row);

    }
}
