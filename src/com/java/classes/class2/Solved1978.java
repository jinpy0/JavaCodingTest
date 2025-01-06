package com.java.classes.class2;

import java.util.Scanner;

public class Solved1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < n; i++) {
            flag = isPrime(arr[i]);
            if(flag) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
