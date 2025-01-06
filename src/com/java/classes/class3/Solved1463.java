package com.java.classes.class3;

import java.util.Scanner;

public class Solved1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[] arr = new int[n + 1]; // 인덱스와 숫자를 맞추기 위해 +1
//        arr[1] = 0;
//        int count = 0;
//        while (n > 1) {
//            if (n % 3 == 0) {
//                arr[n] = arr[n / 3] + 1;
//                count++;
//            } else if (n % 2 == 0) {
//                arr[n] = arr[n / 2] + 1;
//                count++;
//            } else {
//                arr[n] = arr[n - 1] + 1;
//                count++;
//            }
//        }

        int count = 0;
        while (n > 1) {
            if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
