package com.java.classes.class3;

import java.util.Scanner;

// 시간초과 뜸
public class Solved1463_2 {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1]; // n까지 계산해야 하므로 n+1 크기로 설정
        arr[1] = 0; // 1은 연산 없이 1이므로 0으로 초기화
        System.out.println(count(n));
    }

    public static int count(int n) {
        if (n <= 1){
            return 0;
        }

        // 이미 계산된 값이 있으면 반환
        if (arr[n] > 0) {
            return arr[n];
        }

        arr[n] = count(n - 1) + 1;
        // Ex) n == 5 -> arr[4]에 count 1 추가, 4 호출 후 다시 반복

        if (n % 2 == 0) {
            arr[n] = Math.min(arr[n], count(n / 2) + 1);
            // Ex) n == 4 -> arr[4] 와 count(2)에 1을 더한 값을 비교 (2로 나누면 count 2와 실행 시간 똑같음)
        }

        if (n % 3 == 0) {
            arr[n] = Math.min(arr[n], count(n / 3) + 1);
        }

        return arr[n];
    }
}
