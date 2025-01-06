package com.java.classes.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved1003 {
    static int[][] num = new int[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        func(40);

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(num[n][0] + " " + num[n][1]);
        }
    }

    public static void func(int n) {
        num[0][0] = 1;
        num[0][1] = 0;
        num[1][0] = 0;
        num[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            num[i][0] = num[i - 1][0] + num[i - 2][0]; // 0 횟수
            num[i][1] = num[i - 1][1] + num[i - 2][1]; // 1 횟수
        }
    }
}
