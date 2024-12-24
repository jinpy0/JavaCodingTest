package com.java.classes.class1;

import java.util.Scanner;

public class solved2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = String.valueOf((a*b*c));

        for (int i = 0; i < result.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (result.charAt(i)-'0' == j) {
                    ++arr[j];
                    break;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
