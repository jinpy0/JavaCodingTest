package com.java.classes.class1;

import java.util.Scanner;

public class solved3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt()%42;
        }

        boolean flag;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                count++;
            }
        }
        System.out.println(count);
    }
}
