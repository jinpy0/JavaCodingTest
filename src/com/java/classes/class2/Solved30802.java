package com.java.classes.class2;

import java.util.Scanner;

public class Solved30802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 23
        int[] arr = new int[6]; // 3 1 4 1 5 9

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt(); // 5
        int p = sc.nextInt(); // 7

        int count = 0;
        for (int i = 0; i < 6; i++) {
            count+= arr[i] /t; // 사이즈 인원수에 사이즈 묶음 나눈 몫만큼 묶음 추가
            if(arr[i] % t != 0){ // 나머지가 0이 아니면 한 묶음 추가
                count++;
            }
        }
        System.out.println(count);
        System.out.println(n/p+ " "+ n%p); // 펜 묶음과 나머지 출력
    }
}