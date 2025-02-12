package com.java.classes.class2;

import java.util.Scanner;

public class Solved2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if(sum+i == n){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
